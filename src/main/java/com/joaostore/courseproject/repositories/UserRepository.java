package com.joaostore.courseproject.repositories;

import com.joaostore.courseproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
