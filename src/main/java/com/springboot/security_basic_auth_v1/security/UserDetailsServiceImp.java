package com.springboot.security_basic_auth_v1.security;

import com.springboot.security_basic_auth_v1.models.UserEntity;
import com.springboot.security_basic_auth_v1.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {

    private final UserRepository userEntityRepository;

    @Autowired
    public UserDetailsServiceImp(UserRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    @Transactional//Note: this is necessary because roles are Lazy be default
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user= userEntityRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("Username: "+username+" not found!"));

        user.getRoles().size();//Note: this is necessary because roles are Lazy be default
        //OR: Hibernate.initialize(userEntity.getRoles());//Force initialization of the role collection
        return user;
    }

}
