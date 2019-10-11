package com.elegant.user.dao;

import com.elegant.user.model.StudentDto;

public interface StudentDao {

	public void saveStudent(StudentDto dto);

	public StudentDto getStudentDetails();

}
