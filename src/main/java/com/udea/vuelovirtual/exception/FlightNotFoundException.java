package com.udea.vuelovirtual.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // no usages
public class FlightNotFoundException extends RuntimeException {
    public FlightNotFoundException(String message) { // no usages
        super(message);
    }
}