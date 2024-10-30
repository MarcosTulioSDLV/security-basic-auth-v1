package com.springboot.security_basic_auth_v1.dtos;

import com.springboot.security_basic_auth_v1.enums.RoleName;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RoleRequestDto {

    @NotNull
    RoleName roleName;

}