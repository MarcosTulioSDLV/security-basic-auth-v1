package com.springboot.security_basic_auth_v1.exceptions;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(){
    }

    public ProductNotFoundException(String message){
        super(message);
    }

}
