package com.joaostore.courseproject.repositories;

import com.joaostore.courseproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
