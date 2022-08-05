package com.boyo.ecommerceapi.repository;

import com.boyo.ecommerceapi.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
