package com.example.hotel_booking.exception;


///TODO review [RuntimeException]
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
