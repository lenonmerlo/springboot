package com.devlenonmerlo.course.repositories;

import com.devlenonmerlo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
