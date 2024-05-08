package edu.fscj.cen4025c.pizzarestaurant.service;

import edu.fscj.cen4025c.pizzarestaurant.entity.PizzaOrder;
import edu.fscj.cen4025c.pizzarestaurant.repository.PizzaOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaOrderService {
    private final PizzaOrderRepository pizzaOrderRepository;

    @Autowired
    public PizzaOrderService(PizzaOrderRepository pizzaOrderRepository) {
        this.pizzaOrderRepository = pizzaOrderRepository;
    }

    public List<PizzaOrder> getAllPizzaOrders() {
        return pizzaOrderRepository.findAll();
    }
}