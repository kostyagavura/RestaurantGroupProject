package com.tebedukacja.restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private Long id;
    @GeneratedValue
    private int number;
    private Date date;
    @ElementCollection
    private List<NumberOfDishes> listNumDish;
    private NumberTable numTable;
    private boolean isActive;


}
