package com.tebedukacja.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class NumberOfDishes {
    @Embedded
    private Dish dish;
    private int number;


}
