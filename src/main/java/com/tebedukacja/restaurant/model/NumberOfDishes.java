package com.tebedukacja.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class NumberOfDishes {
    @Autowired
    private Dish dish;
    private int number;
}
