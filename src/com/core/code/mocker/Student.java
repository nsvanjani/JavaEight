package com.core.code.mocker;

import java.util.List;

public class Student {

	private String name;
	private List<String> courses;
	private List<Activity>  activitiesList;
	private Boolean isXStudent;
	private Integer id;
	private Double currentScore;
	
	public Student(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public List<Activity> getActivitiesList() {
		return activitiesList;
	}
	public void setActivitiesList(List<Activity> activitiesList) {
		this.activitiesList = activitiesList;
	}
	public Boolean getIsXStudent() {
		return isXStudent;
	}
	public void setIsXStudent(Boolean isXStudent) {
		this.isXStudent = isXStudent;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getCurrentScore() {
		return currentScore;
	}
	public Student(String name, List<String> courses, List<Activity> activitiesList, Boolean isXStudent, Integer id,
			Double currentScore) {
		super();
		this.name = name;
		this.courses = courses;
		this.activitiesList = activitiesList;
		this.isXStudent = isXStudent;
		this.id = id;
		this.currentScore = currentScore;
	}
	public void setCurrentScore(Double currentScore) {
		this.currentScore = currentScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", courses=" + courses + ", activitiesList=" + activitiesList + ", isXStudent="
				+ isXStudent + ", id=" + id + ", currentScore=" + currentScore + "]";
	}
	
}
