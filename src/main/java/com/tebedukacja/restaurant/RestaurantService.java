package com.tebedukacja.restaurant;

import com.tebedukacja.restaurant.model.RestaurantRequest;
import com.tebedukacja.restaurant.model.RestaurantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

//    public RestaurantResponse findRestaurantById(Long id) {
//        Restaurant restaurant = restaurantRepository.findById(id).orElse(null);
//        if (restaurant != null) {
//            return RestaurantResponse.builder()
//                    .id(restaurant.getId())
//                    .name(restaurant.getName())
//                    .addresses(restaurant.getAddresses())
//                    .build();
//        }
//        return null;
//    }
//
//    public void deleteRestaurantById(Long id) {
//        restaurantRepository.deleteById(id);
//    }
//
//    public Iterable<Restaurant> findAllRestaurants() {
//        return restaurantRepository.findAll();
//    }
//
//    public RestaurantResponse saveRestaurant(RestaurantRequest restaurantRequest) {
//        return restaurantRepository.save(restaurant);
//    }
//
//    public RestaurantResponse findRestaurantByName(String name) {
//        Restaurant restaurant = restaurantRepository.findByName(name);
//        if (restaurant != null) {
//            return RestaurantResponse.builder()
//                    .id(restaurant.getId())
//                    .name(restaurant.getName())
//                    .addresses(restaurant.getAddresses())
//                    .build();
//        }
//        return null;
//        public RestaurantResponse saveRestaurant (Restaurant restaurant){
//            return restaurantRepository.save(restaurant);
//        }
//
//        public Restaurant findRestaurantByName (String name){
//            return restaurantRepository.findByName(name);
//
//        }
//
//        public Set<Restaurant> findRestaurantByNameOrByCity (String name, String city){
//            return restaurantRepository.findByNameOrAddressesCity(name, city);
//        }
//    }
}
