package com.xadmin.JSONDoc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.JSONDoc.dao.StudentRepository;
import com.xadmin.JSONDoc.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	
	public String saveStudent(Student student)
	{
		repository.save(student);
		return "saved student with id " + student.getId();
	}
	
	public List<Student> getAllStudent()
	{
		return repository.findAll();
	}
	
	public List<Student> deleteStudent(int id)
	{
		repository.deleteById(id);
		return repository.findAll();
	}
	
	
	

}
