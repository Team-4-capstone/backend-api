package com.codeup.backendapi.service;

import com.codeup.backendapi.data.Location;
import com.codeup.backendapi.data.LocationRepository;
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
    private final LocationRepository locationRepository;

    public ReportService(ReportRepository reportRepository, LocationRepository locationRepository) {
        this.reportRepository = reportRepository;
        this.locationRepository = locationRepository;
    }


    public List<Report> getAll() {
        return reportRepository.findAll();
    }

    public void addReport(CreateReportDto dto, Report newReport, Location location) {

        newReport.setCategory(dto.getCategory());
        newReport.setDescription(dto.getDescription());
        newReport.setStatus(dto.getStatus());
        newReport.setMoreDetails(dto.getMoreDetails());

        location.setLatitude(dto.getLat());
        location.setLongitude(dto.getLon());

        newReport.setLocation(location);
        locationRepository.save(location);
        reportRepository.save(newReport);
    }


}
