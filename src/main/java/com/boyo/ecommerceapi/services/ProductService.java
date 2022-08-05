package com.boyo.ecommerceapi.services;

import com.boyo.ecommerceapi.dtos.ResponseObject;
import com.boyo.ecommerceapi.models.Product;


public interface ProductService {
    Product save(Product product);
    Product get(Integer productID);
    ResponseObject delete(Integer productId);
    ResponseObject update(Integer userID, Product product);
}
