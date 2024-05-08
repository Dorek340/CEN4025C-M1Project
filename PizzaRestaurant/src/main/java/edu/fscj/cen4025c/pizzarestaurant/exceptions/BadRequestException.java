package edu.fscj.cen4025c.pizzarestaurant.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message) {
        super(message);
    }
}
