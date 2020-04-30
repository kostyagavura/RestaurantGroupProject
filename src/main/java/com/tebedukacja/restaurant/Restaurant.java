package com.tebedukacja.restaurant;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;
    @ElementCollection
    private @NonNull List<Address> addresses;
    private boolean isActive;
}
