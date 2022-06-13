package com.codeup.backendapi.service;

import com.codeup.backendapi.data.*;
import com.codeup.backendapi.dto.CreateReportDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@Service
public class ReportService {

    //    ----- FIELDS -----
    private final ReportRepository reportRepository;
    private final LocationRepository locationRepository;
    private final DescriptionRepository descriptionRepository;
    private final CategoryRepository categoryRepository;
    private final StatusRepository statusRepository;

    public ReportService(ReportRepository reportRepository, LocationRepository locationRepository, DescriptionRepository descriptionRepository, CategoryRepository categoryRepository, StatusRepository statusRepository) {
        this.reportRepository = reportRepository;
        this.locationRepository = locationRepository;
        this.descriptionRepository = descriptionRepository;
        this.categoryRepository = categoryRepository;
        this.statusRepository = statusRepository;
    }

    public List<Report> getAll() {
        return reportRepository.findAll();
    }

    public void addReport(CreateReportDto dto,
                          Report newReport, Location location,
                          Description description, Category category,
                          Status status) {

//        if (categoryRepository.findByCategory(dto.getCategory()).equals(dto.getCategory())){
//            System.out.println(dto.getCategory());
//            System.out.println("yes");
//        } else {
//            System.out.println("nah");
//        }

        newReport.setStatus(status);
        category.setCategory(dto.getCategory());
        newReport.setCategory(category);
        newReport.setStatus(newReport.getStatus());
        newReport.setMoreDetails(dto.getMoreDetails());
        location.setLatitude(dto.getLat());
        location.setLongitude(dto.getLon());
        newReport.setLocation(location);


        description.setImg_path(dto.getImg_path());
        description.setColor(dto.getColor());
        description.setQuantity(dto.getQuantity());
        description.setSecondaryColor(dto.getSecondaryColor());
        description.setSize(dto.getSize());

        newReport.setDescription(description);


        statusRepository.save(status);
        categoryRepository.save(category);
        descriptionRepository.save(description);
        locationRepository.save(location);
        reportRepository.save(newReport);

    }


}
