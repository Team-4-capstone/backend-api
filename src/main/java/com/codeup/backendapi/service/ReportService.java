package com.codeup.backendapi.service;

import com.codeup.backendapi.data.*;
import com.codeup.backendapi.dto.CreateReportDto;
import org.springframework.stereotype.Service;

import java.util.Collections;
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

    public void updateReport(CreateReportDto dto, Long id) {

        Report reportToUpdate = reportRepository.findReportById(id);
        Location locationToUpdate = locationRepository.findReportById(id);
        Description descriptionToUpdate = descriptionRepository.findReportById(id);
        Status statusToUpdate = statusRepository.findReportById(id);
        Category categoryToUpdate = categoryRepository.findReportById(id);
//        Location location = new Location(dto.getLat(), dto.getLon());
//        Description description = new Description();
//        Category category = new Category();
//        description.setImg_path(dto.getImg_path());
//        description.setSize(dto.getSize());
//        description.setSecondaryColor(dto.getSecondaryColor());
//        description.setColor(dto.getColor());
//        description.setQuantity(dto.getQuantity());
//        category.setCategory(dto.getCategory());
//        repo.setMoreDetails(dto.getMoreDetails());
//
//
//
//        repo.setLocation(location);
//        repo.setDescription(description);
//        repo.setCategory(category);
        categoryToUpdate.setCategory(dto.getCategory());
        statusToUpdate.setStatus("unverified");
        reportToUpdate.setCategory(categoryToUpdate);
        reportToUpdate.setStatus(statusToUpdate);
        reportToUpdate.setMoreDetails(dto.getMoreDetails());
        locationToUpdate.setLatitude(dto.getLat());
        locationToUpdate.setLongitude(dto.getLon());
        reportToUpdate.setLocation(locationToUpdate);


        descriptionToUpdate.setImg_path(dto.getImg_path());
        descriptionToUpdate.setColor(dto.getColor());
        descriptionToUpdate.setQuantity(dto.getQuantity());
        descriptionToUpdate.setSecondaryColor(dto.getSecondaryColor());
        descriptionToUpdate.setSize(dto.getSize());

        reportToUpdate.setDescription(descriptionToUpdate);


        statusRepository.save(statusToUpdate);
        categoryRepository.save(categoryToUpdate);
        descriptionRepository.save(descriptionToUpdate);
        locationRepository.save(locationToUpdate);
        reportRepository.save(reportToUpdate);


    }

}
