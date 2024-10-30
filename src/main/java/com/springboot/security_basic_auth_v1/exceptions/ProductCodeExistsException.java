package com.springboot.security_basic_auth_v1.exceptions;

public class ProductCodeExistsException extends RuntimeException{

    public ProductCodeExistsException(){
    }

    public ProductCodeExistsException(String message){
        super(message);
    }

}
