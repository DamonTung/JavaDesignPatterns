/**
 * 
 */
package com.damontung.mvc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.damontung.mvc.Student;
import com.damontung.mvc.StudentController;
import com.damontung.mvc.StudentView;

/**
 * @author guangzhd
 *
 */
public class StudentControllerTest {

	@Test
	public void test() {
		Student model = retriveStudentFromDB();

		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		controller.setStudentName("John");

		controller.updateView();
	}

	Student retriveStudentFromDB() {
		Student student = new Student();
		student.setName("Damon");
		student.setRollNo("001");
		return student;
	}
}
