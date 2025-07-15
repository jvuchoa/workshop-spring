package com.joaostore.courseproject.repositories;

import com.joaostore.courseproject.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
