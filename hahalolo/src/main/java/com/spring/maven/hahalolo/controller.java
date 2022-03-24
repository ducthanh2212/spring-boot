package com.spring.maven.hahalolo;

import java.util.List;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.maven.hahalolo.model.Student;
import com.spring.maven.hahalolo.service.StudentService;

@RestController
public class controller {
	private static Student student;
//private static final  

//private static final Logger log = LoggerFactory.getLogger(controller.class); // ghi log lại trong hệ thống

//@GetMapping("/halo")
//public Student demo() {
//	//log.info("=============>> {} {}",student, student);
//	student = new Student();
//	student.setName("hi");// nó đã đc lưu vào static nên gọi lại lần 2 ko cần khởi tạo nữa
//	return student;
//}
	

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/students")
	public Student addStudentList(@RequestBody Student student) throws Exception {
		
		return studentService.adList(student);
	}
	
	@GetMapping("/students")
	public List<Student> getStudentList() throws Exception{
		return studentService.getList();
	}

}
