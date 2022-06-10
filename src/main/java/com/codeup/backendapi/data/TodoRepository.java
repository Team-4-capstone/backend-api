package com.codeup.backendapi.data;

import com.codeup.backendapi.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Photo, Long> {
    Photo findByTitle(String title);
}