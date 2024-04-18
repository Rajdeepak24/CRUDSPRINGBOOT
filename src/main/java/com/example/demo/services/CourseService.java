package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Course;

@Service 
public class CourseService implements CourseServiceInterface {
	
	List<Course> list;
	
	public  CourseService() {
		list = new ArrayList<>();
		list.add(new Course(1,"the creator","Bhagwaat geeta"));
		list.add(new Course(11,"the Bhagwaan","Bahgwaat geeta"));
		
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
 

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c= null;
		for(Course course: list) {
			if(course.getId()== courseId) {
				c= course;
				break;
				
			} 
		}
		
		return  c;
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course  ;
	}

	 

}
