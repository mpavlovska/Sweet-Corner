package com.example.sweetcorner.service;

import com.example.sweetcorner.model.User;

public interface AuthService {

    User login(String username, String password);

}
