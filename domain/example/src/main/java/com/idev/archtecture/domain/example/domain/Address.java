package com.idev.archtecture.domain.example.domain;


import lombok.Data;

/**
 * Address
 * @apiNote ValueObject
 */
@Data
public class Address {
    private String province;
    private String city;
    private String town;
}
