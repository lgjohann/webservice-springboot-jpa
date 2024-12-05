package com.johann.webservicespringboot.repositories;

import com.johann.webservicespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
