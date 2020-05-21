package com.tebedukacja.restaurant.controller;

import com.tebedukacja.restaurant.model.Dish;
import com.tebedukacja.restaurant.model.DishRequest;
import com.tebedukacja.restaurant.servis.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DishController {
    @Autowired
    private DishService dishService;

    @GetMapping("/dishAdd")
    public List<Dish> findByName(@RequestParam String name){
        return dishService.findDishByName(name);
    }

    @GetMapping("/dishAdd")
    public Iterable<Dish> findAll(){
        return dishService.findAll();
    }

    @PostMapping("/dishAdd")
    public String createHotel(@RequestBody DishRequest dishRequest){
        return dishService.saveDish(dishRequest);
    }

    @DeleteMapping("/dishAdd")
    public String deleteDish(@RequestParam String name){
        return dishService.deleteDish(name);
    }
}
