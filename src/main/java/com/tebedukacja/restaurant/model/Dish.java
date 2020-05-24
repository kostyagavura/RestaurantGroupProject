package com.tebedukacja.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Dish {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String details;
    private double price;
    private DishType dishType;



}
