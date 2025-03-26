package com.devlenonmerlo.course.repositories;

import com.devlenonmerlo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
