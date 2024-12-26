package springBootMVC_1.empController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springBootMVC_1.Employee.EmployeeModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class EmpController {
@GetMapping("/employeeform")
public String getemployeeform() {
    return "add-Emp";
}
@PostMapping("/saveEmployee")
public String saveEmployeeForm(EmployeeModel employeeModel) {
    //TODO: process POST request
	
    return "Success";
}
}
