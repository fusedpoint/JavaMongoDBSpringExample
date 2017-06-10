package fusedpoint.com.JavaMongoExample.domainclasses;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

	@Id
	private String id;
	@Indexed(unique = true)
	private String fullname;
	private String position;
	private Double salary;
	
	
	public Employee(String id, String fullname, String position, Double salary) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.position = position;
		this.salary = salary;
	}

	@Id
	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [getID()=" + getID() + ", getFullname()=" + getFullname() + ", getPosition()="
				+ getPosition() + ", getSalary()=" + getSalary() + "]";
	}
	
	
	
	
}
