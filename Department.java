package Hwgulled_BonusHW;

import java.util.ArrayList;

public class Department {
	
	private String name;
	private int budget;
	private ArrayList<Employee> employees = new ArrayList<Employee>(); 
	
	
	public Department(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
		budget += emp.getSalary();
	}
	
	public int getBudget() {
		return budget;
	}
	
	public boolean equals(Object o) {
		Department other = (Department) o;
		return other.name.equals(name);
	}
	
	public ArrayList<Employee> getEmployees(){
		return employees; 
	}
	
	public String toString() {
		return name + ", budget: " + budget;
	}

}
