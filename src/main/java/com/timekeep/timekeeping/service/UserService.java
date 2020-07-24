package com.timekeep.timekeeping.service;


import com.timekeep.timekeeping.entity.User;
import com.timekeep.timekeeping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}
