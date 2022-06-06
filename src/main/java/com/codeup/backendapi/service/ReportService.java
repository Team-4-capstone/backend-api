package com.codeup.backendapi.service;

import com.codeup.backendapi.data.Report;
import com.codeup.backendapi.data.ReportRepository;
import com.codeup.backendapi.dto.CreateReportDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

//    ----- FIELDS -----
private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }



    public List<Report> getAll() {
        return reportRepository.findAll();
    }

    public void addReport(CreateReportDto dto, Report newReport) {

        // get the User object who made the post
//        User user = userService.getUserByUsername(username);

        newReport.setCategory(dto.getCategory());
        newReport.setDescription(dto.getDescription());
        newReport.setStatus(dto.getStatus());
        newReport.setMoreDetails(dto.getMoreDetails());


        // associate the post with the user object
//        user.getPosts().add(newPost);
        // associate the *user* with the post object
//        newPost.setUser(user);



        // TODO: call postsRepository.save(newPost)
        System.out.println(newReport);
        reportRepository.save(newReport);
    }




}
