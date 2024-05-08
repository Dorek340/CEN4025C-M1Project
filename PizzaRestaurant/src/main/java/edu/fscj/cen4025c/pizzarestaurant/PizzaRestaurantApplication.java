package edu.fscj.cen4025c.pizzarestaurant;

import edu.fscj.cen4025c.pizzarestaurant.repository.CustomerRepository;
import edu.fscj.cen4025c.pizzarestaurant.repository.PizzaRepository;
import edu.fscj.cen4025c.pizzarestaurant.repository.PizzaOrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PizzaRestaurantApplication {

    public static void main(String[] args) {

        SpringApplication.run(PizzaRestaurantApplication.class, args);
    }

    @Bean
    public CommandLineRunner testDatabaseRepositories(
                CustomerRepository customerRepo,
                PizzaRepository pizzaRepo,
                PizzaOrderRepository pizzaOrderRepo) {
        return args -> {
            System.out.println("FINDALLCUSTOMERS");
            customerRepo.findAll().forEach(customer ->
                    System.out.println(customer));
            System.out.println("FINDBYLASTNAME");
            customerRepo.findByLastName("Smith").forEach(customer ->
                    System.out.println(customer));
            System.out.println("FINDBYUSERID");
            System.out.println(customerRepo.findByUserId("sallybrown"));

            System.out.println("FINDALLPIZZAS");
            pizzaRepo.findAll().forEach(pizza ->
                    System.out.println(pizza));
            System.out.println("FINDBYPIZZATYPE");
            pizzaRepo.findByPizzaType("pepperoni").forEach(pizza ->
                    System.out.println(pizza));

            System.out.println("FINDALLPIZZAORDERS");
            pizzaOrderRepo.findAll().forEach(order ->
                    System.out.println(order));
            System.out.println("FINDBYPIZZAPIZZATYPE");
            pizzaOrderRepo.findByPizzaPizzaType("pepperoni").
                    forEach(pizza -> System.out.println(pizza));
            System.out.println("FINDBYPIZZAPIZZATYPEIGNORECASE");
            pizzaOrderRepo.findByPizzaPizzaTypeIgnoreCase("PEPPERONI")
                    .forEach(pizza -> System.out.println(pizza));

            System.out.println("FINDBYPIZZAPIZZASIZE");
            pizzaOrderRepo.findByPizzaPizzaSize(14)
                    .forEach(pizza -> System.out.println(pizza));
            System.out.println("FINDBYPIZZAPIZZACRUSTTYPE");
            pizzaOrderRepo.findByPizzaCrustTypeIgnoreCase("thin")
                    .forEach(pizza -> System.out.println(pizza));
            // add your method call here
            System.out.println("FINDBYCUSTOMERCUSTOMERLASTNAME");
            pizzaOrderRepo.findByCustomerLastNameIgnoreCase("thin")
                    .forEach(pizza -> System.out.println(pizza));
            // add your method call here

            System.out.println("DONE");
        };
    }
}
