package com.mvc.controller;

import com.mvc.domain.Student;
import com.mvc.view.StudentView;

public class StudentController {

	private Student model;
	private StudentView view;

	/**
	 * @param mode
	 * @param view
	 */
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}

}
