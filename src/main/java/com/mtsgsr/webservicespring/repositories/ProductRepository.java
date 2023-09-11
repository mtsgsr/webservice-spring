package com.mtsgsr.webservicespring.repositories;

import com.mtsgsr.webservicespring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
