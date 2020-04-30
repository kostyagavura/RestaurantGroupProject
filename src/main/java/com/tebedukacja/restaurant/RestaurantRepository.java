package com.tebedukacja.restaurant;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {
    Restaurant findByName(String name);

    Set<Restaurant> findByNameOrAddressesCity(String name, String city);
}
