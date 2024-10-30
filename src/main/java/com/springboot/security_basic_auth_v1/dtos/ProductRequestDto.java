package com.springboot.security_basic_auth_v1.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class ProductRequestDto {

    @NotBlank
    private String productCode;

    @NotBlank
    private String name;

    @NotNull @PositiveOrZero
    private BigDecimal price;

    @NotBlank
    private String country;

}
