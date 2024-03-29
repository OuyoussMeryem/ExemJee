package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import metier.entities.Employee;

public class EmpoyeeImpl implements IEmployee {
	private EntityManager em=JPAutil.getEntityManager("ExemJEE");

	@Override
	public Employee getEmployee(long id) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Employee Employee=em.find(Employee.class, id);
		tx.commit();
		return Employee;
	}

	@Override
	public void save(Employee Employee) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(Employee);
		tx.commit();
		
	}

	@Override
	public Employee update(Employee Employee) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.merge(Employee);
		tx.commit();
		return Employee;
	}

	@Override
	public void delete(long id) {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Employee p=em.find(Employee.class,id);
		em.remove(p);
		tx.commit();
		
	}

	@Override
	public List<Employee> selectAll() {
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		Query query=em.createQuery("select p from Employee p");
		tx.commit();
		return query.getResultList();
	}

	

}
