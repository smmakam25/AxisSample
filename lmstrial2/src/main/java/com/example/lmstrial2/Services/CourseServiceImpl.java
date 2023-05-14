package com.example.lmstrial2.Services;

import com.example.lmstrial2.Model.Course;

import com.example.lmstrial2.Repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository courseRepository;
    @Override
    public List<Course> getAll() {
        List<Course> courses=courseRepository.findAll();
        return courses;
    }
    @Override
    public Course save(Course course){
        Course c=courseRepository.save(course);
        return c;
    }

}
