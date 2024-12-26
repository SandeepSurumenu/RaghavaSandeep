package springBootMVC__0.employee;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Employee {
	int id;
	String name;
	double salary;
	public static void main(String[] args) {
		Employee employee = Employee.builder()
				.id(101)
				.name("Sandeep")
				.salary(35000.89)
				.build();
		System.out.println(employee);
	}
}
