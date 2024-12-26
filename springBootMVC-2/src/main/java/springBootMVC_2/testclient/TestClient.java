package springBootMVC_2.testclient;

import springBootMVC_2.Controller.Controller;
import springBootMVC_2.repository.Employee;

public class TestClient {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		Controller controller = new Controller();
		controller.controllerMethod(employee);
		
	}
}
