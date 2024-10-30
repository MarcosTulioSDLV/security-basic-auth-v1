package com.springboot.security_basic_auth_v1.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class ProductResponseDto {

    private Long id;

    private String productCode;

    private String name;

    private BigDecimal price;

    private String country;

    private LocalDateTime creationDate;

}
