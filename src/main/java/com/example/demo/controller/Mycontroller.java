package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Course;
import com.example.demo.services.CourseServiceInterface;

@RestController

public class Mycontroller {
	@Autowired
	private CourseServiceInterface courseService;
	

	
	@GetMapping("/home")
	public String home(){
		return "Hello Rajzz";
		 
	}
	
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
		
	}
	
	 @GetMapping("/courses/{courseId}")
	 public Course	getCourse(@PathVariable String courseId) 
	 {
		 return this.courseService.getCourse(Long.parseLong(courseId));
	 }
	 
	 
	 @PostMapping("/courses")
	 public Course addCourse(@RequestBody Course course) {
		 return this.courseService.addCourse(course);
	 }

}
