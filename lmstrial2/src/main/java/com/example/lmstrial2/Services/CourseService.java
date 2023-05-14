package com.example.lmstrial2.Services;

import com.example.lmstrial2.Model.Course;
import com.example.lmstrial2.Model.User;

import java.util.List;

public interface CourseService {

    List<Course> getAll();
    Course save(Course course);
}
