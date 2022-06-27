package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Long> {

    @Query(nativeQuery = true,
            value = "USE bomb_reporter_db; SELECT id FROM uxo_location l WHERE l.reports_id  = ?; ")
    List<Location> findByLat(@Param("id") String id);

    Location findReportById(Long id);
}
