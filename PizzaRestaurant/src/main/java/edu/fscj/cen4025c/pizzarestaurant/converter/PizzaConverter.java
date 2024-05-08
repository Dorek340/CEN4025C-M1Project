package edu.fscj.cen4025c.pizzarestaurant.converter;

import edu.fscj.cen4025c.pizzarestaurant.dto.PizzaDTO;
import edu.fscj.cen4025c.pizzarestaurant.entity.Pizza;
import org.springframework.stereotype.Component;

@Component
public class PizzaConverter {
    public PizzaDTO convertToDTO(Pizza pizza) {
        PizzaDTO dto = new PizzaDTO();
        dto.setPizzaType(pizza.getPizzaType());
        dto.setPizzaSize(pizza.getPizzaSize());
        dto.setCrustType(pizza.getCrustType());
        return dto;
    }

    public Pizza converttoPizza(PizzaDTO pizzaDTO) {
        Pizza pizza = new Pizza();
        pizza.setPizzaType(pizzaDTO.getPizzaType());
        pizza.setPizzaSize(pizzaDTO.getPizzaSize());
        pizza.setCrustType(pizzaDTO.getCrustType());
        return pizza;
    }
}
