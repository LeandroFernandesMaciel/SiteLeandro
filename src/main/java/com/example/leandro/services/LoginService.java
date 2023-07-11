package com.example.leandro.services;

import com.example.leandro.models.UserModel;
import com.example.leandro.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepositorie userRepositorie;

    public UserModel logar(UserModel userModel){
        return userRepositorie.login(userModel.getEmail(), userModel.getPassword());
    }
}
