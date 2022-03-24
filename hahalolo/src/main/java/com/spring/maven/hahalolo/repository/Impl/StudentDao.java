package com.spring.maven.hahalolo.repository.Impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.spring.maven.hahalolo.model.Student;
import com.spring.maven.hahalolo.repository.IStudentDao;

@Repository
public class StudentDao implements IStudentDao {
	private static Logger logger = LogManager.getLogger(StudentDao.class);
	
	public static List<Student> lstStudent = null;

	static {
		lstStudent = new ArrayList<>();		
	}

	@Override
	public Student adList(Student student) {
		try {
			logger.info("Ghi log trước khi thêm "+student);
			lstStudent.add(student);
		} catch (Exception e) {
			logger.warn("Lỗi thêm dữ liệu student "+e.toString());
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public List<Student> getList() {
		try {
			logger.info("Ghi log khi lấy dữ liệu "+lstStudent);
		} catch (Exception e) {
			logger.warn("Lỗi lấy dữ liệu student "+e.toString());
			e.printStackTrace();
		}
		return lstStudent;
	}
}
