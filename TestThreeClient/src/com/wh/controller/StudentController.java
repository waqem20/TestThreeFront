package com.wh.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wh.manager.StudentManager;
import com.wh.view.StudentView;

@RestController
public class StudentController {

	@Autowired
	private StudentManager studentManager;

	@RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
	public List<StudentView> getAllStudents() {
		return studentManager.findAllStudent();
	}

	@PutMapping(value = "/studentRegistry/updateStudent/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentView> updateStudent(@RequestBody StudentView currentStudent) {
		System.out.println(currentStudent.getDate() + " student date controller");
		Logger.getLogger("in the update CONTROLLER");
		Logger.getLogger("update student:" + currentStudent);
		studentManager.updateStudent(currentStudent, currentStudent.getId());
		return new ResponseEntity<>(currentStudent, HttpStatus.OK);
	}

	@RequestMapping(value = "/studentRegistry/deleteStudent/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<StudentView> deleteStudent(@PathVariable("id") Integer id) {
		studentManager.deleteStudentById(id);
		Logger.getLogger("deleted student with the id of :" + id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
