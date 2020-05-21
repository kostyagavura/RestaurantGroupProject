package com.tebedukacja.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.List;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private List<String> isReserved;
    private int number;
    private double from;
    private double until;

}
