package com.freecodingpaths.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String course_name;
	private String video_links;
	private String notes_links;
	public Courses(int id, String course_name, String video_links, String notes_links) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.video_links = video_links;
		this.notes_links = notes_links;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return course_name;
	}
	public void setName(String course_name) {
		this.course_name = course_name;
	}
	public String getVideoLinks() {
		return video_links;
	}
	public void setVideoLinks(String video_links) {
		this.video_links = video_links;
	}
	public String getNotesLinks() {
		return notes_links;
	}
	public void setPrice(String notes_links) {
		this.notes_links = notes_links;
	}
	
}