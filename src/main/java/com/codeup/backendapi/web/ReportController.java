package com.codeup.backendapi.web;

import com.codeup.backendapi.data.*;
import com.codeup.backendapi.dto.CreateReportDto;
import com.codeup.backendapi.service.ReportService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @GetMapping("{id}")
    public Report getById(@PathVariable Long id) {
        for (Report report : reportService.getAll()) {
            if (Objects.equals(report.getId(), id)) {
                return report;
            }
        }
        return null;
    }


    @PostMapping
    public String createPost(@RequestBody CreateReportDto dto) {

        Report report = new Report();
        Location location = new Location();
        Description description = new Description();
        Category category = new Category();
        Status status = new Status();
        return reportService.addReport(dto, report, location, description, category, status);
    }

    @PutMapping("{id}")
    private void updateReport(@RequestBody CreateReportDto dto, @PathVariable Long id) {
        reportService.updateReport(dto, id);
    }


}
