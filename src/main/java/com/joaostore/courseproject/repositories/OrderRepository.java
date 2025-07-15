package com.joaostore.courseproject.repositories;

import com.joaostore.courseproject.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
