package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReportRepository extends JpaRepository<Report, Integer> {

    @Query("from Report a where a.title like %:term%")
    List<Report> searchByTitleLike(@Param("term") String term);

//    // TODO: nativeQuery = true will allow you to write actual SQL in the value attribute!
//    @Query(nativeQuery = true, value = "UPDATE users SET password = :password WHERE id = :id")
//    void updatePassword(Long id, String password);

}
