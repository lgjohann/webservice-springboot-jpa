package com.johann.webservicespringboot.repositories;

import com.johann.webservicespringboot.entities.Category;
import com.johann.webservicespringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
