package com.mtsgsr.webservicespring.repositories;

import com.mtsgsr.webservicespring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
