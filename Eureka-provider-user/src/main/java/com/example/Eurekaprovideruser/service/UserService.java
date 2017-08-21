package com.example.Eurekaprovideruser.service;

import com.example.Eurekaprovideruser.model.User;
import com.example.Eurekaprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by XSC on 2017/8/20.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User getOne(Integer id){
        return userRepository.findOne(id);
    }
}
