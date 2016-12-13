/**
 * 
 */
package com.damontung.transfer_object;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLContext;

/**
 * @author guangzhd
 *
 */
public class StudentBO {
	List<StudentVO> students;

	public StudentBO() {
		students = new ArrayList<StudentVO>();
		StudentVO student1 = new StudentVO("Damon", 1);
		StudentVO student2 = new StudentVO("Tung", 2);

		students.add(student1);
		students.add(student2);
	}

	public void deleteStudent(StudentVO student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No: " + student.getRollNo() + ", deleted form db.");
	}

	public List<StudentVO> getAllStudents() {
		return students;
	}

	public StudentVO getStudent(int rollNo) {
		return students.get(rollNo);
	}

	public void updateStudent(StudentVO student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Roll No: " + student.getRollNo() + ", updated in the db.");
	}
}
