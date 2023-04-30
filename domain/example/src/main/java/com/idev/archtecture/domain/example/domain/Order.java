package com.idev.archtecture.domain.example.domain;

import lombok.Data;

import java.util.List;

/**
 * Order Aggregation Root
 */

@Data
public class Order {

    private Long id;


    private List<Item> items;


    private Address address;
}
