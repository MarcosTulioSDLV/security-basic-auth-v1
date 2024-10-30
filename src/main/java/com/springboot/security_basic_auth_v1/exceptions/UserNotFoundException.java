package com.springboot.security_basic_auth_v1.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(){
    }

    public UserNotFoundException(String message){
        super(message);
    }

}
