package com.deploy.praktikum6.repository;

import com.deploy.praktikum6.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
