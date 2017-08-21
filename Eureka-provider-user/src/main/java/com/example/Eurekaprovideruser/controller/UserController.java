package com.example.Eurekaprovideruser.controller;

import com.example.Eurekaprovideruser.model.User;
import com.example.Eurekaprovideruser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by XSC on 2017/8/20.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> index(){
        return userService.findAll();
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable("id") Integer id){
        return userService.getOne(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void save(User user){
        System.out.println(user);
        userService.save(user);
    }
}
