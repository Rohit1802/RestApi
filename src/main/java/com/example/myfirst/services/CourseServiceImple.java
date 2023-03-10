package com.example.myfirst.services;

import com.example.myfirst.entities.Course;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CourseServiceImple implements CourseService {

  List<Course> list;

  public CourseServiceImple() {
    list = new ArrayList<>();
    list.add(new Course(125, "Java core course", "Basics of java"));
    list.add(new Course(126, "Spring core course", "Basics of spring"));
    list.add(new Course(127, "Javascript course", "Basics of javascript"));
    list.add(new Course(128, "react course", "Basics of react"));
  }

  @Override
  public List<Course> getCourses() {
    return list;
  }

  @Override
  public Course getCourse(long courseId){
    Course c = null;
    for(Course course : list){
      if(course.getId() == courseId){
        c = course;
        break;
      }
    }

    return c;
  }

  @Override
  public Course addCourse(Course course){
    list.add(course);
    return course;
  }

  @Override
  public Course UpdateCourse(Course course){
    list.forEach(e->{
      if(e.getId() == course.getId()){
        e.setTitle(course.getTitle());
        e.setDescription(course.getDescription());
      }
    });

    return course;
  }

  @Override
  public void deleteCourse(long parseLong){
    list= this.list.stream().filter(e->e.getId() !=parseLong).collect(Collectors.toList());
  }
    
}
