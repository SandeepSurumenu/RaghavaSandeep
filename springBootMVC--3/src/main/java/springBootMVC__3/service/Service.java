package springBootMVC__3.service;

import org.springframework.beans.factory.annotation.Autowired;

import springBootMVC__3.employee.Employee;
import springBootMVC__3.repository.Repository;
 
@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repository repository;
	public void serviceMethod( Employee employee) {
		Repository repository = new Repository();

		repository.repositoryMethod(employee);
	}
}
