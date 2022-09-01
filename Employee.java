// Name: Hunter Gulledge | BlazerID: Hwgulled

package Hwgulled_BonusHW;

public class Employee {
	public String firstname;
	public String lastname;
	public String title;
	public String deptID;
	public int salary;
	
	public Employee(String firstname, String lastname, String title, String deptID, int salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.title = title;
		this.deptID = deptID;
		this.salary = salary;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}
	
	public String getDeptID() {
		return deptID;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String toString() {
		return firstname + " | " + lastname + " | " + title + " | " + deptID + " | " + salary + " ";
	}
	
	
}
