package com.example.leandro.services;





import com.example.leandro.models.UserModel;
import com.example.leandro.repositories.UserRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {


    @Autowired
    private UserRepositorie userRepositorie;


    public UserModel save(UserModel userModel){
        return userRepositorie.save(userModel);
    }

    public List<UserModel> findAll(){
        return userRepositorie.findAll();
    }


    public Optional<UserModel> findById(Integer id){
        return userRepositorie.findById(id);
    }

    public void deleteById(Integer id){
        userRepositorie.deleteById(id);
    }

}

