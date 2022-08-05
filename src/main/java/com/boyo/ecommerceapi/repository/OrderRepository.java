package com.boyo.ecommerceapi.repository;

import com.boyo.ecommerceapi.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
