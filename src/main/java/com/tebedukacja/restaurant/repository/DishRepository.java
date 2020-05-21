package com.tebedukacja.restaurant.repository;

import com.tebedukacja.restaurant.model.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends CrudRepository<Dish, Long> {
   List<Dish> findByName(String name);
   void deleteByName(String name);
}
