package com.mtsgsr.webservicespring.repositories;

import com.mtsgsr.webservicespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
