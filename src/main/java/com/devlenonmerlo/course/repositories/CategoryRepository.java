package com.devlenonmerlo.course.repositories;

import com.devlenonmerlo.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
