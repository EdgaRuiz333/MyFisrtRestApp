package com.mdf.firstRestApi.My_first_app.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mdf.firstRestApi.My_first_app.models.Course;
import com.mdf.firstRestApi.My_first_app.payloads.ApiResponse;

public interface ICourseService {
	
	ResponseEntity<ApiResponse> saveCourse(Course course);
	Course getCourse(String name);
	List<Course> getAllCourses(int from, int limit);
	ResponseEntity<ApiResponse> updateCourse(Course course, long id);
	ResponseEntity<ApiResponse> deleteCourse(long id);

}
