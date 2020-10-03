package com.xadmin.JSONDoc.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

@Entity
@Table
@ApiObject
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3884059268847465798L;
	@Id
	@GeneratedValue
	@ApiObjectField(name = "student id", description = " This is auto generatd id")
	private int id;
	@ApiObjectField(name="student name", description = "This is the student name")
	private String name;
	@ApiObjectField(name="student course", description = "THis is student selected course")
	private String course;
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	

}
