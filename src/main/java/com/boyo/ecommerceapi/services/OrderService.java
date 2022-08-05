package com.boyo.ecommerceapi.services;

import com.boyo.ecommerceapi.dtos.ResponseObject;
import com.boyo.ecommerceapi.models.Order;


public interface OrderService {
    Order save(Order order);
    Order get(Integer orderId);
    ResponseObject delete(Integer order);
    ResponseObject update(Integer orderID, Order order);
}
