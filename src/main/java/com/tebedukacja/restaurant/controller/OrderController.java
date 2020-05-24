package com.tebedukacja.restaurant.controller;

import com.tebedukacja.restaurant.model.Dish;
import com.tebedukacja.restaurant.model.DishRequest;
import com.tebedukacja.restaurant.model.Order;
import com.tebedukacja.restaurant.model.OrderRequest;
import com.tebedukacja.restaurant.servis.DishService;
import com.tebedukacja.restaurant.servis.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orderAdd")
    public Order findOrderByNumber(@RequestParam int number){
        return orderService.findOrderByNumber(number);
    }

    @GetMapping("/orderAdd")
    public Iterable<Order> findAll(){
        return orderService.findAll();
    }

    @PostMapping("/orderAdd")
    public String createOrder(@RequestBody OrderRequest orderRequest){
        return orderService.saveOrder(orderRequest);
    }

    @PutMapping("/orderAdd/{orderNumber}")
    public String updateOrder(@RequestBody OrderRequest orderRequest, @PathVariable int orderNumber){
        return orderService.saveOrder(orderRequest, orderNumber);
    }

    @DeleteMapping("/orderAdd")
    public String deleteOrder(@RequestParam int number){
        return orderService.deleteOrder(number);
    }
}
