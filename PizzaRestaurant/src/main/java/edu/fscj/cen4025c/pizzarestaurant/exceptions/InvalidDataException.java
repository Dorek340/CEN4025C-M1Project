package edu.fscj.cen4025c.pizzarestaurant.exceptions;

public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {
        super(message);
    }
}
