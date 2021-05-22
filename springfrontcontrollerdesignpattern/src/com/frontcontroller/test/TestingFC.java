package com.frontcontroller.test;

import com.frontcontroller.controller.FrontController;

public class TestingFC {
	public static void main(String[] args) {

		FrontController fc = new FrontController();
		fc.dispatchRequest("home");
		fc.dispatchRequest("student");

	}
}
