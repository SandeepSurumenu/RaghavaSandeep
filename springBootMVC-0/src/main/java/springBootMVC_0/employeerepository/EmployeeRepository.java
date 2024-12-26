package springBootMVC_0.employeerepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeRepository, Long> {

}
