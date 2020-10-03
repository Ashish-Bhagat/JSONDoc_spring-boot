package com.xadmin.JSONDoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xadmin.JSONDoc.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Integer>{

}
