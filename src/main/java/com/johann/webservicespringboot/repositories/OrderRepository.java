package com.johann.webservicespringboot.repositories;

import com.johann.webservicespringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
