package com.mtsgsr.webservicespring.repositories;

import com.mtsgsr.webservicespring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
