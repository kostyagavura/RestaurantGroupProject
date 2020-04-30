package com.tebedukacja.restaurant.model;

import com.tebedukacja.restaurant.Address;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Builder
@Getter
@Setter
public class RestaurantRequest {
    private String name;
    private List<Address> addresses;
}
