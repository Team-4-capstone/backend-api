package com.codeup.backendapi.web;

import com.codeup.backendapi.data.*;
import com.codeup.backendapi.dto.CreateReportDto;
import com.codeup.backendapi.service.ReportService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/reports", headers = "Accept=application/json")
public class ReportController {

    private final ReportService reportService;

    List<Report> reports = new ArrayList<>();

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping
    public List<Report> getAllReports() {
        return reportService.getAll();
    }

//    @PostMapping
//    public void createPost(@RequestBody CreateReportDto dto) {
//
//        System.out.println(dto);
//
//        Report report = new Report();
//        Location location = new Location();
//        Description description = new Description();
//        Category category = new Category();
//        Status status = new Status();
//        reportService.addReport(dto, report, location, description, category, status);
//    }



}
