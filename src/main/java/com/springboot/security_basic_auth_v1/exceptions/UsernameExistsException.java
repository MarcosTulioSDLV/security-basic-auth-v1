package com.springboot.security_basic_auth_v1.exceptions;

public class UsernameExistsException extends RuntimeException{

    public UsernameExistsException(){
    }

    public UsernameExistsException(String message){
        super(message);
    }

}
