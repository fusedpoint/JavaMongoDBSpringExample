package fusedpoint.com.JavaMongoExample.Repositoryclasses;

import java.util.List;

import com.mongodb.WriteResult;

import fusedpoint.com.JavaMongoExample.domainclasses.Employee;

public interface Repository <T> {

	public void saveEmployeeObject(Employee emp);
	
	public void deleteEmployeeObject(String id);
	
	public WriteResult updateEmployeeObject(String id, String fullname, String position, Double salary);
	
	public List<T> getAllEmployees();
	
	public T getEmployee(String id);
}
