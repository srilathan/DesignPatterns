package com.mvc.testing;

import com.mvc.controller.StudentController;
import com.mvc.domain.Student;
import com.mvc.view.StudentView;

public class Testing {

	public static void main(String[] args) {

		Student model = retrieveStudentFromDatabase(); // model fetch the student details from the DB

		StudentView view = new StudentView(); // View object printing the student details console...

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		// update the model
		controller.setStudentName("Srilatha");
		controller.setStudentRollNo("444444");

		controller.updateView();

	}

	private static Student retrieveStudentFromDatabase() {

		Student student = new Student();// container object ...
		student.setName("Ramu  ");
		student.setRollNo("100");

		return student;

	}

}
