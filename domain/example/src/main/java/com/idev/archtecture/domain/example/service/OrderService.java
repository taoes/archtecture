package com.idev.archtecture.domain.example.service;

import com.idev.archtecture.domain.example.domain.Order;

public interface OrderService {

    Order findById(Long id);
}
