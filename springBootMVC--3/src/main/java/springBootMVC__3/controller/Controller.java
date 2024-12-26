package springBootMVC__3.controller;

import org.springframework.beans.factory.annotation.Autowired;

import springBootMVC__3.employee.Employee;
import springBootMVC__3.service.Service;
@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	Service service;
	public void controllerMethod(Employee employee) {
		service.serviceMethod(employee);
	}
}
