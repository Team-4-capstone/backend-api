package com.codeup.backendapi.web;

import com.codeup.backendapi.data.Report;
import com.codeup.backendapi.service.ReportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
}
