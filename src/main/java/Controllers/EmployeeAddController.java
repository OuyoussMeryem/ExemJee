package Controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

import dao.EmpoyeeImpl;
import metier.entities.Employee;

@ManagedBean(name = "employeeAddController")
@ViewScoped
public class EmployeeAddController {
	Employee employee=new Employee();
	EmpoyeeImpl metier=new EmpoyeeImpl();
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String AddEmployeet() {
		metier.save(employee);
		return "employees";
	}
}
