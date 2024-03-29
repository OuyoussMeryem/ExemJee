package Controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import metier.entities.Employee;
import dao.EmpoyeeImpl;

@ManagedBean(name = "employeeController")
@SessionScoped
public class EmployeeController {
Employee employee=new Employee();
EmpoyeeImpl metier=new EmpoyeeImpl();
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}

public List<Employee> findAllEmployee() {
	List<Employee> employees = metier.selectAll();
	return employees;
}

public String deletePatient(Employee employee) {
	metier.delete(employee.getId());
	return "employees";
}

public String ModifyPatient(Employee p) {
	this.employee = metier.getEmployee(p.getId());
	return "patient-update";
}



}
