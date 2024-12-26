package springBootMVC_0.employeservice;

import java.util.List;

import springBootMVC_0.employeeentity.Employee;

public interface EmployeeSercive {
	
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findById(Long id);
	public List<Employee> findAll();
}
