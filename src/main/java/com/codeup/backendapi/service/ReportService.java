package com.codeup.backendapi.service;

import com.codeup.backendapi.data.*;
import com.codeup.backendapi.dto.CreateReportDto;
import org.springframework.stereotype.Service;

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

    public String addReport(CreateReportDto dto,
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
        String reportId = reportRepository.findReportByLocation(dto.getLat());

        return reportId;

    }

    public void updateReport(CreateReportDto dto, Long id) {


//        gets from the tables all objects that have the report id based on the parameter id from above
        Report reportToUpdate = reportRepository.findReportById(id);
        Location locationToUpdate = locationRepository.findReportById(id);
        Description descriptionToUpdate = descriptionRepository.findReportById(id);
        Status statusToUpdate = statusRepository.findReportById(id);
        Category categoryToUpdate = categoryRepository.findReportById(id);

//        once grabbed those objects, sets updated values from the dto
        categoryToUpdate.setCategory(dto.getCategory());

//        TODO might need to create a set status field on DTO
//        TODO status its been hard coded but might need to create String status on dto to update it
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


//        save them back again into their respective repository to update them
        statusRepository.save(statusToUpdate);
        categoryRepository.save(categoryToUpdate);
        descriptionRepository.save(descriptionToUpdate);
        locationRepository.save(locationToUpdate);

//        finally save the report tp update changes
        reportRepository.save(reportToUpdate);
    }

}
