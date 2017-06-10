package fusedpoint.com.JavaMongoExample.Repositoryclasses;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.mongodb.WriteResult;

import fusedpoint.com.JavaMongoExample.domainclasses.Employee;

public class EmployeeRepository implements Repository<Employee>{

	MongoTemplate mongoTemplate;
	
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public void saveEmployeeObject(Employee emp) {
		// TODO Auto-generated method stub
		mongoTemplate.insert(emp);
		
	}

	public void deleteEmployeeObject(String id) {
		// TODO Auto-generated method stub
		mongoTemplate.remove(new Query(Criteria.where("id").is(id)), Employee.class);
		
	}


	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.mongoTemplate.findAll(Employee.class);
	}

	public Employee getEmployee(String EmployeeID) {
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(EmployeeID)),
				Employee.class);
	}

	public WriteResult updateEmployeeObject(String id, String fullname, String position, Double salary) {
		// TODO Auto-generated method stub
		
		Query query = new Query();
		/*query.addCriteria(Criteria
				.where("EmployeeID").exists(true)
				.orOperator(Criteria.where("EmployeeID").is(id),
						Criteria.where("EmployeeID").is(id2)));*/
		query.addCriteria(Criteria.where("id").is(id));
		
		Update update = new Update();
		update.set("fullname", fullname);
		update.set("position", position);
		update.set("salary", salary);
		
		//update.unset("createdDate");

		return mongoTemplate.updateFirst(query, update, Employee.class);

		
		
	}

	
	
}
