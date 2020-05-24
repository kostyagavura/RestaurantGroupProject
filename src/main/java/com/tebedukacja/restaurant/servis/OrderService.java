package com.tebedukacja.restaurant.servis;

import com.tebedukacja.restaurant.model.Dish;
import com.tebedukacja.restaurant.model.DishRequest;
import com.tebedukacja.restaurant.model.Order;
import com.tebedukacja.restaurant.model.OrderRequest;
import com.tebedukacja.restaurant.repository.DishRepository;
import com.tebedukacja.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Order findOrderByNumber(int number){
        return orderRepository.findByNumber(number);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public String  saveOrder(OrderRequest ordReq){
        Order order = new Order (0L,0, new Date(),ordReq.getListNumDish(),ordReq.getNumTable(),true);
        orderRepository.save(order);
        return " Order added )";
    }

    public String  saveOrder(OrderRequest ordReq, int numOrder){
        Order order = new Order (0L,numOrder, new Date(),ordReq.getListNumDish(),ordReq.getNumTable(),true);
        orderRepository.save(order);
        return " Order updated )";
    }

    public String  deleteOrder(int number){
        orderRepository.deleteByNumber(number);
        return " Order deleted )";
    }
}
