package com.wh.manager;

import java.util.List;

import com.wh.entity.Student;
import com.wh.view.StudentView;

public interface StudentManager {

	void saveStudent(Student student);

	void updateStudent(Student currentStudent, Integer id);

	List<StudentView> findAllStudent();

	void deleteStudentById(Integer id);
}
