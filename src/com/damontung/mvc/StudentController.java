/**
 * 
 */
package com.damontung.mvc;

/**
 * @author guangzhd
 *
 */
public class StudentController {
	private Student model;
	private StudentView view;

	public StudentController(Student student, StudentView studentView) {
		super();
		this.model = student;
		this.view = studentView;
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentName(String name) {
		this.model.setName(name);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void setStudentRollNo(String no) {
		this.model.setRollNo(no);
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
