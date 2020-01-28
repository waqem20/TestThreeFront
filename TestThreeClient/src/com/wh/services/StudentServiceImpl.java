package com.wh.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.wh.entity.Student;
import com.wh.view.StudentView;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private RestTemplate restTemplate;

	private static final String API = "http://localhost:8080/";

	@Override
	public void saveStudent(Student student) {
		restTemplate.postForObject(API + "addStudent", student, StudentView.class);
	}

	@Override
	public void updateStudent(Student student, Integer id) {
		System.out.println(student.getDate() + " student date service");
		Map<String, Integer> params = new HashMap<String, Integer>();
		params.put("id", id);
		restTemplate.put(API + "updateStudent/{id}", student, params);
	}

	@Override
	public List<StudentView> findAllStudent() {
		ResponseEntity<List<StudentView>> response = restTemplate.exchange(API + "getAllStudents", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<StudentView>>() {
				});
		return response.getBody();
	}

	@Override
	public void deleteStudentById(Integer id) {
		restTemplate.delete(API + "deleteStudent/{id}", id, Student.class);
	}
}
