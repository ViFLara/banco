package com.womanbank.api.banco.services.exceptions;

public class InvalidInputException extends RuntimeException {

    public InvalidInputException(String errorMessage) {
        super(errorMessage);
    }

}