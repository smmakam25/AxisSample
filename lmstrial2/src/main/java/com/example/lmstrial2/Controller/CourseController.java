package com.example.lmstrial2.Controller;

import com.example.lmstrial2.Model.Course;
import com.example.lmstrial2.Model.User;
import com.example.lmstrial2.Services.CourseService;
import com.example.lmstrial2.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService CourseService;


    @GetMapping("/getAllCourse")
    List<Course> getCourses() {
        List<Course> courses = CourseService.getAll();
        return courses;
    }

    @GetMapping("/test")
    public String test(){

        return "in user controller";
    }



    }
