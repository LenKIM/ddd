package com.example.ch01jpa.persistence.repository;

import com.example.ch01jpa.domain.core.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
