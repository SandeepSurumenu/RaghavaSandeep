package springBootMVC_2.repository;

import springBootMVC_2.employee.Employee;

@org.springframework.stereotype.Repository
public class Repository {
	public void repositoryMethod(Employee employee) {
		System.out.println(employee);
	}

}
