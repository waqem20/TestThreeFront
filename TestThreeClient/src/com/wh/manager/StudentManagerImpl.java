package com.wh.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wh.entity.Student;
import com.wh.services.StudentService;
import com.wh.view.StudentView;

@Service("studentManager")
public class StudentManagerImpl implements StudentManager {

	@Autowired
	private StudentService studentService;

	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentService.saveStudent(student);
	}

	@Override
	@Transactional
	public void updateStudent(Student currentStudent, Integer id) {
		System.out.println(currentStudent.getDate() + " student date manager");
		studentService.updateStudent(currentStudent, id);
	}

	@Override
	@Transactional
	public List<StudentView> findAllStudent() {
		return studentService.findAllStudent();
	}

	@Override
	@Transactional
	public void deleteStudentById(Integer id) {
		studentService.deleteStudentById(id);
	}
}
