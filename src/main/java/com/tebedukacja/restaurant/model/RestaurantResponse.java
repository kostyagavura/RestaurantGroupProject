package com.tebedukacja.restaurant.model;

import com.tebedukacja.restaurant.Address;
import lombok.Builder;

import java.util.List;

@Builder
public class RestaurantResponse {
    private Long id;
    private String name;
    private List<Address> addresses;
}
