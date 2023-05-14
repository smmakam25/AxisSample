package com.example.lmstrial2.Repository;

import com.example.lmstrial2.Model.Course;
import com.example.lmstrial2.Model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {


    }
