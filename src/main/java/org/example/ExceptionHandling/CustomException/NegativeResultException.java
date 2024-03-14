package org.example.ExceptionHandling.CustomException;

public class NegativeResultException extends Exception{
    public NegativeResultException(String message){
        super(message);
    }
}
