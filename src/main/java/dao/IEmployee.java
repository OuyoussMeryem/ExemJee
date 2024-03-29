package dao;

import java.util.List;

import metier.entities.Employee;

public interface IEmployee {
	public Employee getEmployee(long id);

	public void save(Employee employee);

	public Employee update(Employee employee);

	public void delete(long id);

	public List<Employee> selectAll();
}
