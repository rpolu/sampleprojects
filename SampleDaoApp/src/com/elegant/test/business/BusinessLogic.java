package com.elegant.test.business;

import java.util.Scanner;

import com.elegant.user.dao.StudentDao;
import com.elegant.user.dao.impl.StudentDaoImpl;
import com.elegant.user.model.StudentDto;

public class BusinessLogic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter Roll Num");
		int rollNum = scanner.nextInt();

		System.out.println("Please enter Name");
		String name = scanner.next();

		System.out.println("Please enter marks");
		int marks = scanner.nextInt();

		System.out.println("Please enter Address");
		String address = scanner.next();

		StudentDto studentDto = new StudentDto();
		studentDto.setRollNum(rollNum);
		studentDto.setName(name);
		studentDto.setMarks(marks);
		studentDto.setAddress(address);

		StudentDao studentDao = new StudentDaoImpl();
		studentDao.saveStudent(studentDto);

		System.out.println(" Student registration succesas");

	}

}
