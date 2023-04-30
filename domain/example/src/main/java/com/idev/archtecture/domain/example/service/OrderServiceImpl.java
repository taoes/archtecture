package com.idev.archtecture.domain.example.service;

import com.idev.archtecture.domain.example.domain.Order;

public class OrderServiceImpl implements OrderService {
    @Override
    public Order findById(Long id) {
        return new Order();
    }
}
