package com.example.lmstrial2.Services;
import com.example.lmstrial2.Model.User;

import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User save(User user);


}
