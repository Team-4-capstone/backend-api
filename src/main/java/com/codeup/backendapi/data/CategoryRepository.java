package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<Category, Long> {

//    Category findCategoryByName(Category category);
//    String findCategoryByCategory(String category);

//    @Query(nativeQuery = true,
//            value = "SELECT name FROM categories WHERE categories.name = ?; ")
//    String findByCategory(String name);

    Category findReportById(Long id);
}
