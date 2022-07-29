package sample;

import java.sql.SQLException;

import java.util.List;


public interface EmployeeDao {

	public void saveEmp(Employee employee) throws ClassNotFoundException, SQLException;

	public List<Employee> displayListOfEmployee();

}
