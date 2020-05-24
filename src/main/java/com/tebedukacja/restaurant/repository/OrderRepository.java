package com.tebedukacja.restaurant.repository;

import com.tebedukacja.restaurant.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository< Order, Long> {
    Order findByNumber(int number);
    void deleteByNumber(int number);
}
