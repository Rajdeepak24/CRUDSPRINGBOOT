package com.example.demo.dao;

public class Course {
	public Course(long id, String title, String details) {
		super();
		this.id = id;
		this.title = title;
		this.details = details;
	}
	private long id;
	private String title;
	private String details;
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", details=" + details + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	 

}
