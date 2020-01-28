package com.wh.services;

import java.util.List;

import com.wh.entity.Student;
import com.wh.view.StudentView;

public interface StudentService {

	void saveStudent(Student student);

	void updateStudent(Student currentStudent, Integer id);

	List<StudentView> findAllStudent();

	void deleteStudentById(Integer id);
}
