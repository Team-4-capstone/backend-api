package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Posts, Long> {


    Posts findReportById(Long id);




//
//    SELECT * from posts
//    JOIN uxo_posts up on posts.id = up.uxo_posts WHERE reports_id = 1;

    @Query(nativeQuery = true,
            value = "SELECT * FROM posts JOIN uxo_posts up on posts.id = up.uxo_posts WHERE reports_id = ?; ")
    List<Posts> findAllByReportId(Long id);

}
