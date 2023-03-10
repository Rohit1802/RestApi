package com.example.myfirst.services;

import java.util.List;
import com.example.myfirst.entities.Course;


public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course UpdateCourse(Course course);

    public void deleteCourse(long courseId);
}
