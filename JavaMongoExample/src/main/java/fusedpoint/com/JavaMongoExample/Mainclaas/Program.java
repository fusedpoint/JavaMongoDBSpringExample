package fusedpoint.com.JavaMongoExample.Mainclaas;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fusedpoint.com.JavaMongoExample.Repositoryclasses.EmployeeRepository;
import fusedpoint.com.JavaMongoExample.Repositoryclasses.Repository;
import fusedpoint.com.JavaMongoExample.domainclasses.Employee;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");

		Repository repository = context.getBean(EmployeeRepository.class);

		repository.saveEmployeeObject(new Employee("1", "Jake Duvall", "I.T", 3647.09));
		repository.saveEmployeeObject(new Employee("2", "Badmos Duvall", "I.T", 3047.09));
		repository.saveEmployeeObject(new Employee("3", "Steve Hall", "I.T", 5647.09));
		repository.saveEmployeeObject(new Employee("4", "Jake Peters", "I.T", 1647.09));
		

		System.out.println("All Employees" + repository.getAllEmployees());

		//System.out.println("Employee with id 1" + repository.getEmployee("1"));

		
		//repository.updateEmployeeObject("1", "Susan Smith", "Security", 423365.73);

		//System.out.println(repository.getAllEmployees());

		//repository.deleteEmployeeObject("1");

		
	}

}
