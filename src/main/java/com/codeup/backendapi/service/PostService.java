package com.codeup.backendapi.service;


import com.codeup.backendapi.data.*;
import com.codeup.backendapi.dto.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {


    private final PostRepository postRepository;
    private final ReportRepository reportRepository;
    private final LocationRepository locationRepository;
    private final DescriptionRepository descriptionRepository;
    private final CategoryRepository categoryRepository;
    private final StatusRepository statusRepository;

    public PostService(PostRepository postRepository, ReportRepository reportRepository, LocationRepository locationRepository, DescriptionRepository descriptionRepository, CategoryRepository categoryRepository, StatusRepository statusRepository) {
        this.postRepository = postRepository;
        this.reportRepository = reportRepository;
        this.locationRepository = locationRepository;
        this.descriptionRepository = descriptionRepository;
        this.categoryRepository = categoryRepository;
        this.statusRepository = statusRepository;
    }

    public void addPost(PostDto dto, Posts post, Long id) {

        Posts posts = new Posts();
        posts.setContent(dto.getComments());
        Report reportToUpdate = reportRepository.findReportById(id);
        Location locationToUpdate = locationRepository.findReportById(id);
        Description descriptionToUpdate = descriptionRepository.findReportById(id);
        Status statusToUpdate = statusRepository.findReportById(id);
        Category categoryToUpdate = categoryRepository.findReportById(id);
        System.out.println(id);
        List<Posts> postsList = postRepository.findAllByReportId(id);
        postsList.add(posts);
        reportToUpdate.setPosts(postsList);



        postRepository.save(posts);
        statusRepository.save(statusToUpdate);
        categoryRepository.save(categoryToUpdate);
        descriptionRepository.save(descriptionToUpdate);
        locationRepository.save(locationToUpdate);

//        finally save the report tp update changes
        reportRepository.save(reportToUpdate);

    }


}
