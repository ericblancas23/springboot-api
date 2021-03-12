package com.eric.employee.exception;

public class UserNotFoundExcepton extends RuntimeException {
    public UserNotFoundExcepton(String message) {
        super(message);
    }
}
