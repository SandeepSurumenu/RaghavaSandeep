package springBootMVC_2.service;

import org.springframework.data.repository.Repository;

import springBootMVC_2.employee.Employee;
@org.springframework.stereotype.Service
class Service {
	Repository repository = new Repository();
	public void serviceMethod(Employee employee) {
		  repository.repositoryMethod(employee);
	}
}
