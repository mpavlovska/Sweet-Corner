package com.example.sweetcorner.service;

import com.example.sweetcorner.model.Role;
import com.example.sweetcorner.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword, String name, String surname, Role role);

}
