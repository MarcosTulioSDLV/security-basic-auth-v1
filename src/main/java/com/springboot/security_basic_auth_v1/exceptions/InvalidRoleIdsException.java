package com.springboot.security_basic_auth_v1.exceptions;

public class InvalidRoleIdsException extends RuntimeException{

    public InvalidRoleIdsException(){
    }

    public InvalidRoleIdsException(String message){
        super(message);
    }

}
