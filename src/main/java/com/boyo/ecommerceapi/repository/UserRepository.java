package com.boyo.ecommerceapi.repository;

import com.boyo.ecommerceapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
