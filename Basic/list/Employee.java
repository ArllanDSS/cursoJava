package list;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	

	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void salaryIncrease(Double increase) {
		salary += salary * (increase/100);
	}
	
	
	public String toString() {
		
		return id + ", " + name + ", " + salary;
		
	}
	
}
