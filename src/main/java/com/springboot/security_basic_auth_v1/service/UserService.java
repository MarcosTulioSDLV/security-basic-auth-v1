package com.springboot.security_basic_auth_v1.service;

import com.springboot.security_basic_auth_v1.dtos.LoginUserRequestDto;
import com.springboot.security_basic_auth_v1.dtos.UserRequestDto;
import com.springboot.security_basic_auth_v1.dtos.UserResponseDto;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    Page<UserResponseDto> getAllUsers(Pageable pageable);

    UserResponseDto getUserById(Long id);

    @Transactional
    UserResponseDto registerUser(UserRequestDto userRequestDto);

    @Transactional
    void loginUser(LoginUserRequestDto longinUserRequestDto);

    @Transactional
    void removeUser(Long id);
}