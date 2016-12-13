/**
 * 
 */
package com.damontung.transfer_object.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.transfer_object.StudentBO;
import com.damontung.transfer_object.StudentVO;

/**
 * @author guangzhd
 *
 */
public class StudentBOTest {

	@Test
	public void test() {
		StudentBO studentBO = new StudentBO();

		for (StudentVO student : studentBO.getAllStudents()) {
			System.out.println("Student: Roll No: " + student.getRollNo() + ", Name: " + student.getName());
		}

		StudentVO studentVO = studentBO.getAllStudents().get(0);
		studentVO.setName("DD");
		studentBO.updateStudent(studentVO);

		studentVO = studentBO.getAllStudents().get(0);
		System.out.println("Student: Roll No: " + studentVO.getRollNo() + ", Name: " + studentVO.getName());
	}

}
