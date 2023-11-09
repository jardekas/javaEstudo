package entities;


public class Employee{

	
	private Integer id;
	private String name;
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id 
			    + ", "
			    + name
			    + ", "
			    + String.format("%.2f", salary);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	private Double salary;
	
	public void increaseSalary(double percentage) {
		salary = salary*(1+percentage/100);
	}
}
