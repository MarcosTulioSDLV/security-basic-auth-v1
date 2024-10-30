package com.springboot.security_basic_auth_v1.exceptions;

public class RoleNameExistsException extends RuntimeException{

    public RoleNameExistsException(){
    }

    public RoleNameExistsException(String message){
        super(message);
    }

}
