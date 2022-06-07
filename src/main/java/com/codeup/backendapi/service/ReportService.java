package com.codeup.backendapi.service;

import com.codeup.backendapi.data.*;
import com.codeup.backendapi.dto.CreateReportDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    //    ----- FIELDS -----
    private final ReportRepository reportRepository;
    private final LocationRepository locationRepository;
    private final DescriptionRepository descriptionRepository;

    public ReportService(ReportRepository reportRepository, LocationRepository locationRepository
            , DescriptionRepository descriptionRepository) {
        this.reportRepository = reportRepository;
        this.locationRepository = locationRepository;
        this.descriptionRepository = descriptionRepository;
    }


    public List<Report> getAll() {
        return reportRepository.findAll();
    }

    public void addReport(CreateReportDto dto, Report newReport, Location location, Description description, Category category) {

        newReport.setStatus(newReport.getStatus());
        newReport.setMoreDetails(dto.getMoreDetails());
        location.setLatitude(dto.getLat());
        location.setLongitude(dto.getLon());
        newReport.setLocation(location);


        description.setColor(dto.getColor());
        description.setImg_file_path(dto.getImg_file_path());
        description.setQuantity(dto.getQuantity());
        description.setSecondaryColor(dto.getSecondaryColor());
        description.setSize(dto.getSize());

        newReport.setDescription(description);

        descriptionRepository.save(description);
        locationRepository.save(location);
        reportRepository.save(newReport);
    }


}
