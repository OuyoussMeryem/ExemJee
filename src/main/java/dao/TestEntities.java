package dao;

import javax.persistence.EntityManager;

import metier.entities.Employee;
import metier.entities.Project;

public class TestEntities {

	public static void main(String[] args) {
		
		EntityManager em=JPAutil.getEntityManager("ExemJEE");
	   Project project =new Project();
	   Employee empl=new Employee();
	   
	   project.setBudget(234);
	   project.setName("test");
	   empl.setEmail("hjdhjdhd");
	   empl.setName("meryem");
	   empl.setSkills("none");
	   
	   em.persist(empl);
	   em.persist(project);
	   
	   System.out.println("inserer");
	   
}
}
