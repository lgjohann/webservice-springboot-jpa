package com.johann.webservicespringboot.repositories;

import com.johann.webservicespringboot.entities.Category;
import com.johann.webservicespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
