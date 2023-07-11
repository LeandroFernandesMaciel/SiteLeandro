package com.example.leandro.repositories;


import com.example.leandro.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepositorie extends JpaRepository<UserModel,Integer> {

    //   Esta é query que sera executada toda vez que o usuario for fazer login; Ela vai verificar na tabela de usuarios se o login e a senha informados existem
    @Query(value = "select * from usuarios where email = :email and password = :senha",nativeQuery = true)
    public UserModel login(String email, String senha);
}
