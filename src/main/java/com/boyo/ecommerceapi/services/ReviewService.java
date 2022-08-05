package com.boyo.ecommerceapi.services;

import com.boyo.ecommerceapi.dtos.ResponseObject;
import com.boyo.ecommerceapi.models.Review;
import com.boyo.ecommerceapi.models.User;

public interface ReviewService {
    Review save(Review review);
    Review get(Integer reviewId);
    ResponseObject delete(Integer reviewID);
    ResponseObject update(Integer reviewID, Review review);
}
