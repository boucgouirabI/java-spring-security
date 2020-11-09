package com.projet.springsecurity.service;

import com.projet.springsecurity.entity.User;
import com.projet.springsecurity.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
@Slf4j

public class UserService implements UserDetailsService {

    @Autowired
    private  UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Objects.requireNonNull(username);
        return userRepository.findUserWithName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
