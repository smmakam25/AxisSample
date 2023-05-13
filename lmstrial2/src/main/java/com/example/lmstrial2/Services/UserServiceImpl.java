package com.example.lmstrial2.Services;

import com.example.lmstrial2.Model.User;
import com.example.lmstrial2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        List<User> users=userRepository.findAll();
        return users;
    }

    @Override
    public User save(User user) {
        User user1=userRepository.save(user);
        return user1;
    }
}
