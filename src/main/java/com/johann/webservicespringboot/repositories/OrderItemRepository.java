package com.johann.webservicespringboot.repositories;

import com.johann.webservicespringboot.entities.OrderItem;
import com.johann.webservicespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
