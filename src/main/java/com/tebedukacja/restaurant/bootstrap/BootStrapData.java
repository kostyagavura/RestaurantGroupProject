package com.tebedukacja.restaurant.bootstrap;

import ch.qos.logback.core.CoreConstants;
import com.tebedukacja.restaurant.model.Dish;
import com.tebedukacja.restaurant.model.DishType;
import com.tebedukacja.restaurant.repository.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {

    private final DishRepository dishRepository;

    public BootStrapData(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Dish dish1 = new Dish(0L,"Morning in Miami","Eggs in T-shirts on toast with slices of crispy bacon and with" +
                " the addition of Dutch sauce.", 21.9, DishType.BREAKFASTS);
        System.out.println(dish1);
    }
}
