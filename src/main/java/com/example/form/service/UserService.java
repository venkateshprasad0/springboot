package com.example.form.service;


import com.example.form.UserRepository;
import com.example.form.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository repository;

    @Override
    public List<user> findAll() {

        var users = (List<user>) repository.findAll();

        return users;
    }

}
