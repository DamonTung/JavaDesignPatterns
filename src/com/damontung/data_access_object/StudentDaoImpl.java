/**
 * 
 */
package com.damontung.data_access_object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guangzhd
 *
 */
public class StudentDaoImpl implements StudentDao {
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert", 1);
		Student student2 = new Student("Damon", 3);

		students.add(student1);
		students.add(student2);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.data_access_object.StudentDao#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.damontung.data_access_object.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.damontung.data_access_object.StudentDao#updateStudent(com.damontung.
	 * data_access_object.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println("Student: Role No " + student.getRollNo() + ", updated in the database.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.damontung.data_access_object.StudentDao#deleteStudent(com.damontung.
	 * data_access_object.Student)
	 */
	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database.");
	}

}
