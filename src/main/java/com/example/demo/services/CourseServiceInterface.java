package com.example.demo.services;

import java.util.List;

import com.example.demo.dao.Course;

public interface CourseServiceInterface {
	
	public List<Course> getCourses();
	public Course getCourse(long courseId );
	public Course addCourse(Course course);

}
