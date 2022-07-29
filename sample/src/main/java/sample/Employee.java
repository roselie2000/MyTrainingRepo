package sample;

public class Employee {

	//Data members
	private Integer id;
	private String name;
	private String designation;
	private Long basicSalary;

	//empty constructor
	public Employee() {

	}

	//parameterized constructor
	public Employee(Integer id, String name, String designation, Long basicSalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
	}

	//getter for id 
	public int getId() {
		return id;
	}

	//setter for id
	public void setId(Integer id) {
		this.id = id;
	}

	//getter for name
	public String getName() {
		return name;
	}

	//setter for name
	public void setName(String name) {
		this.name = name;
	}

	//getter for designation
	public String getDesignation() {
		return designation;
	}

	//setter for designation
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	//getter for salary
	public Long getSalary() {
		return basicSalary;
	}

	//setter for salary
	public void setSalary(long basicSalary) {
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", basicSalary=" + basicSalary
				+ "]";
	}
}
