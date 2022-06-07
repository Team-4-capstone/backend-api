package com.codeup.backendapi.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

//    Category findCategoryByName(Category category);
    String findCategoryByCategory(String category);

}
