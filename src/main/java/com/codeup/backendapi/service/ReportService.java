package com.codeup.backendapi.service;

import com.codeup.backendapi.data.Report;
import com.codeup.backendapi.data.ReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

//    ----- FIELDS -----
private final ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public ReportService() {
    }

    public List<Report> getAll() {
        return reportRepository.findAll();
    }




}
