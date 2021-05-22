package com.frontcontroller.controller;

import com.frontcontroller.dispatcher.Dispatcher;

public class FrontController {

	private Dispatcher dispatcher;

	public FrontController() {
		dispatcher = new Dispatcher();
	}

	private boolean isAuthenticUser() {
		System.out.println(": user is authernticated sucess");

		return true;
	}

	private void trackRequest(String request) {
		System.out.println(" Inside the trackRequest      :" + request);
	}

	public void dispatchRequest(String request) {
		// each request...
		trackRequest(request);// home

		// authenticatin the user
		if (isAuthenticUser()) {

			dispatcher.dispatch(request);
		}
	}

}
