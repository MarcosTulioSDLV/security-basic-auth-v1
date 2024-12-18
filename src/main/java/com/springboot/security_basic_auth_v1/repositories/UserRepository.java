package com.springboot.security_basic_auth_v1.repositories;

import com.springboot.security_basic_auth_v1.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    boolean existsByUsername(String username);

    Optional<UserEntity> findByUsername(String username);

}