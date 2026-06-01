package com.ecart.digi_app.exception;

public class MandatoryValidationException extends RuntimeException
{
    public MandatoryValidationException(String message) {
        super(message);
    }
}
