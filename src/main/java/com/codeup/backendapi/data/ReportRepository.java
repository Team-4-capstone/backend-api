package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReportRepository extends JpaRepository<Report, Integer> {

    Report findReportById(Long id);

    @Query(nativeQuery = true,
            value = "SELECT reports_id FROM uxo_location l JOIN location l2 on l2.id = l.uxo_location WHERE latitude = ?; ")
    String findReportByLocation(String lat);

//    @Query("from Report a where a.title like %:term%")
//    List<Report> searchByTitleLike(@Param("term") String term);

//    // TODO: nativeQuery = true will allow you to write actual SQL in the value attribute!
//    @Query(nativeQuery = true, value = "UPDATE users SET password = :password WHERE id = :id")
//    void updatePassword(Long id, String password);

//    @Query(nativeQuery = true,
//            value = "USE bomb_reporter_db; SELECT * FROM reports r WHERE r.id  = ?; ")
//    String findById(@Param("id") String id);

//
//    @Query(nativeQuery = true,
//            value = "USE bomb_reporter_db; SELECT * FROM reports r WHERE r.id  = ?; ")
//    Report getAllById(Long id);
}