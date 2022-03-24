package com.spring.maven.hahalolo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.maven.hahalolo.model.Student;
import com.spring.maven.hahalolo.repository.Impl.StudentDao;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public Student adList(Student student) throws Exception{
		return studentDao.adList(student);
	}
	
	public List<Student> getList() throws Exception{
		return studentDao.getList();
	}
}
