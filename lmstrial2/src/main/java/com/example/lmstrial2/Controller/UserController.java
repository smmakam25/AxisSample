package com.example.lmstrial2.Controller;


import com.example.lmstrial2.Model.User;
import com.example.lmstrial2.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<User> getall(){
        return  userService.getAll();

    }

    @PostMapping("/users")
    public User saveUsers(@Validated @RequestBody User user){

        return userService.save(user);
    }


}
