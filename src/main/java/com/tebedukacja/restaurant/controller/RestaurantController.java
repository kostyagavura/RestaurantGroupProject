package com.tebedukacja.restaurant.controller;

import com.tebedukacja.restaurant.Restaurant;
import com.tebedukacja.restaurant.RestaurantService;
import com.tebedukacja.restaurant.model.RestaurantRequest;

import com.tebedukacja.restaurant.model.RestaurantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/restaurants/{restaurantId}")
    public RestaurantResponse getRestaurant(@PathVariable Long restaurantId) {
        return restaurantService.findRestaurantById(restaurantId);
    }

    @GetMapping("/restaurants/name")
    public RestaurantResponse findRestaurantByName(@RequestParam String name) {
        return restaurantService.findRestaurantByName(name);
    }

    @GetMapping("/restaurants/filtered")
    public Set<RestaurantResponse> findRestaurantByCity(@RequestParam String name, String city) {
        return restaurantService.findRestaurantByNameOrByCity(name, city);
    }

    @DeleteMapping("/restaurants/{restaurantId}")
    public void deleteRestaurant(@PathVariable Long restaurantId) {
        restaurantService.deleteRestaurantById(restaurantId);
    }

    @GetMapping("/restaurants")
    public Iterable<RestaurantResponse> getAllRestaurants() {
        return restaurantService.findAllRestaurants();
    }

    @PostMapping("/restaurants")
    public RestaurantResponse createRestaurant(@RequestBody RestaurantRequest restaurantRequest) {
        return restaurantService.saveRestaurant(restaurantRequest);
    }

    @PutMapping("/restaurants")
    public RestaurantResponse updateRestaurant(@RequestBody RestaurantRequest restaurantRequest) {

        return restaurantService.saveRestaurant(restaurantRequest);
    }
}
