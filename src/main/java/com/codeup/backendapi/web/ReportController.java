package com.codeup.backendapi.web;

import com.codeup.backendapi.data.Report;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/reports", headers = "Accept=application/json")
public class ReportController {

    List<Report> reports = new ArrayList<>();

    @GetMapping
    public List<Report> getAllReports() {
        Report report1 = new Report(1L, "bomb1", "4567894", "testDesc", "unverified");
        reports.add(report1);
        return reports;
    }
}
