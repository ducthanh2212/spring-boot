package com.spring.maven.hahalolo.repository;

import java.util.List;

import com.spring.maven.hahalolo.model.Student;

public interface IStudentDao {
	public Student adList(Student lStudents);
	public List<Student> getList();
}
