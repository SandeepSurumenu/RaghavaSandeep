package springBootMVC__3.testclient;

import org.springframework.beans.factory.annotation.Autowired;

import springBootMVC__3.controller.Controller;
import springBootMVC__3.employee.Employee;
public class TestClient {
	
	@Autowired
	Controller controller;
	
	public static void main(String[] args) {
		Employee employee = new Employee(101, "varun", 34000.90);
		
		controller.controllerMethod(employee);
	}
}
