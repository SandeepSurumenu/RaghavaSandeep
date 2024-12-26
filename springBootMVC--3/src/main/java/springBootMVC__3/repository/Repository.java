package springBootMVC__3.repository;

import springBootMVC__3.employee.Employee;

@org.springframework.stereotype.Repository
public class Repository {
	public void repositoryMethod(Employee employee) {
		
		System.out.println(employee);
	}
}
