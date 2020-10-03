package com.xadmin.JSONDoc.controller;

import java.util.List;

import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.jsondoc.core.pojo.ApiVisibility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.JSONDoc.model.Student;
import com.xadmin.JSONDoc.service.StudentService;

@RestController
@Api(name="Student Api", description = "Student Mangement System", group = "Student", visibility = ApiVisibility.PUBLIC, stage = ApiStage.BETA)
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	@RequestMapping(value="/saveStudent", method = RequestMethod.POST)
	@ApiMethod(description = "Add new Student")
	public String saveStudent(@RequestBody Student student ) {
		return service.saveStudent(student);
	}
	
	@RequestMapping(value="/getAllStudent", method = RequestMethod.GET)
	@ApiMethod(description = "Get all students")
	public List<Student> getAllStudent() {
		return service.getAllStudent();
	}
	
	@RequestMapping(value="/deleteStudent/{id}", method = RequestMethod.DELETE)
	@ApiMethod(description = "Remove Student by id", path = {"id"})
	public List<Student> deleteStudent(@PathVariable @ApiPathParam(description = "student id", name = "id") int id) {
		return service.deleteStudent(id);
	}
	
	

}
