package com.damontung.data_access_object.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.data_access_object.Student;
import com.damontung.data_access_object.StudentDao;
import com.damontung.data_access_object.StudentDaoImpl;

public class StudentDaoImplTest {

	@Test
	public void test() {
		StudentDao studentDao = new StudentDaoImpl();

		for (Student student : studentDao.getAllStudents()) {
			System.out.println("Student: [Roll No " + student.getRollNo() + ", Name :" + student.getName() + " ].");
		}

		Student student = studentDao.getAllStudents().get(0);
		student.setName("DamonTung");
		studentDao.updateStudent(student);

		studentDao.getStudent(0);
		System.out.println("Student: [Roll No : " + student.getRollNo() + ", Name : " + student.getName() + " ].");
	}

}
