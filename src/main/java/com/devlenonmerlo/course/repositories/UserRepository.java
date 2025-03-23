package com.devlenonmerlo.course.repositories;

import com.devlenonmerlo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
