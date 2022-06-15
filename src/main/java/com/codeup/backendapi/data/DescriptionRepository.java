package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DescriptionRepository extends JpaRepository<Description, Long> {


    Description findReportById(Long id);

}
