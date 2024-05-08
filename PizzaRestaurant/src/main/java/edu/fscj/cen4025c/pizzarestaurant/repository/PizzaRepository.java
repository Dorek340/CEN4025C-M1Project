package edu.fscj.cen4025c.pizzarestaurant.repository;

import edu.fscj.cen4025c.pizzarestaurant.entity.Customer;
import edu.fscj.cen4025c.pizzarestaurant.entity.Pizza;
import edu.fscj.cen4025c.pizzarestaurant.entity.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
    // find by pizza type
    List<Pizza> findByPizzaType(String pizzaType);
    // find by pizza size
    List<Pizza> findByPizzaSize(int size);
    // find by pizza crust type
    List<Pizza> findByCrustType(String crustType);
}