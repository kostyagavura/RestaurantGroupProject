package com.tebedukacja.restaurant.servis;

import com.tebedukacja.restaurant.model.Dish;
import com.tebedukacja.restaurant.model.DishRequest;
import com.tebedukacja.restaurant.repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishService {
    @Autowired
    private DishRepository dishRepository;

    public List<Dish> findDishByName(String name){
        return dishRepository.findByName(name);
    }

    public Iterable<Dish> findAll(){
        return dishRepository.findAll();
    }

    public String  saveDish(DishRequest dishReq){
        Dish dish = new Dish (0L,dishReq.getName(),dishReq.getDetails(),dishReq.getPrice(),dishReq.getDishType());
        dishRepository.save(dish);
        return " Dish added )";
    }

    public String  deleteDish(String name){
        dishRepository.deleteByName(name);
        return " Dish deleted )";
    }
}
