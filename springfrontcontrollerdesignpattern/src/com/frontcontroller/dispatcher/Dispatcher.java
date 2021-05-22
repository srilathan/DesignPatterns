package com.frontcontroller.dispatcher;

import com.frontcontroller.view.HomeView;
import com.frontcontroller.view.StudentView;

public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();

	}

	public void dispatch(String request) {// home
		System.out.println(" Inside the Dispatch...method....");

		if (request.equalsIgnoreCase("student")) {
			studentView.show();
		} else {
			homeView.show();
		}
	}

}
