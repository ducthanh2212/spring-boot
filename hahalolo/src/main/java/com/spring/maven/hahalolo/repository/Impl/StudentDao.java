package com.spring.maven.hahalolo.repository.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.spring.maven.hahalolo.model.Student;
import com.spring.maven.hahalolo.repository.IStudentDao;

@Repository
public class StudentDao implements IStudentDao {

	public static List<Student> lstStudent = null;
	public static Logger log = null;
	static {
		lstStudent = new ArrayList<>();
		log = Logger.getLogger(StudentDao.class.getName());
	}

	@Override
	public Student adList(Student student) {
		try {
			log.log(java.util.logging.Level.INFO, "Truoc khi them" + student);
			lstStudent.add(student);
		} catch (Exception e) {
			log.log(java.util.logging.Level.WARNING, e.toString());
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public List<Student> getList() {
		try {
			log.log(java.util.logging.Level.INFO, "Lay danh sach" + lstStudent);
		} catch (Exception e) {
			log.log(java.util.logging.Level.WARNING, "Loi" + e);
			e.printStackTrace();
		}
		return lstStudent;
	}
}
