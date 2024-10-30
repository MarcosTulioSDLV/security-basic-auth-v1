package com.springboot.security_basic_auth_v1.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class LoginUserRequestDto {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
