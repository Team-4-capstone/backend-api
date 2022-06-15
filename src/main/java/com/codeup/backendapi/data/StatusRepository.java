package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {


    Status findReportById(Long id);
}
