package Hwgulled_BonusHW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> employeeArr = new ArrayList<Employee>();
		ArrayList<Department> departments = new ArrayList<Department>();
		
		String line = "";
		
		try {
			File employeesfile = new File("company_records.csv");
			Scanner fileScanner = new Scanner(new BufferedReader(new FileReader(employeesfile)));
			
			fileScanner.nextLine();
			//While loop that iterates over the CSV file so that it instantiates a new object and puts it into the ArrayList
			while (fileScanner.hasNextLine()) {
				line = fileScanner.nextLine();
				String [] employeeslist = line.split(",");
				
				Employee companyemployee = new Employee(employeeslist[0],employeeslist[1],employeeslist[2],employeeslist[3], Integer.parseInt(employeeslist[4]));
				employeeArr.add(companyemployee);
			
			Department dept = new Department(companyemployee.getDeptID());
			
			
			if(!departments.contains(dept)) {
				dept.addEmployee(companyemployee);
				departments.add(dept);
				
			} else {
				int index = departments.indexOf(dept);
				departments.get(index).addEmployee(companyemployee);
				
			}
			
			}
			
			fileScanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
			
			
			System.out.println("The Budgets of each department are as follows: ");
			
			for(int i = 0; i < departments.size(); i++) {
				System.out.printf("%-20s%d%n", departments.get(i).getName(), departments.get(i).getBudget());
			}
			
			System.out.println();
			
			
			System.out.println("The company has " + departments.size() + " " + "departments.");
			System.out.println("The current departments that the company has are as follows: ");
			System.out.println();
			
			for(int i = 0; i < departments.size(); i++) {
				System.out.println(departments.get(i).getName());
			}
			
			//Finding employees with minimum and maximum salaries and displaying their info
			Employee minsalary = employeeArr.get(0);
			Employee maxsalary = employeeArr.get(0);
			
			for(int i = 1; i < employeeArr.size(); i++) {
				if(employeeArr.get(i).getSalary() < minsalary.getSalary()) {
					minsalary = employeeArr.get(i);
				}
				
				if(employeeArr.get(i).getSalary() > maxsalary.getSalary()) {
					maxsalary = employeeArr.get(i);
				}
			}
			
			System.out.println();
			System.out.println("The employee with the highest salary is: " + maxsalary);
			System.out.println("The employee with the lowest salary is: " + minsalary);
			
			
			//Sorting the departments according to their budgets (gathering each dept's budget then sorting)
			System.out.println();
			System.out.println("Departments sorted according to their budgets:");
			
			Collections.sort(departments, (d1, d2) -> d2.getBudget() - d1.getBudget());
			for(int i = 0; i < departments.size(); i++) {
				System.out.printf("%-20s%d%n", departments.get(i).getName(), departments.get(i).getBudget());
			}
			System.out.println();
			
			
			//Sorting the departments according to their total number of employees (gathering employee amounts then sorting)
			System.out.println("Departments sorted according to their number of employees:");
			
			Collections.sort(departments, (d1, d2) -> d2.getEmployees().size() - d1.getEmployees().size());
			for(int i = 0; i < departments.size(); i++) {
				System.out.printf("%-20s%d%n", departments.get(i).getName(), departments.get(i).getEmployees().size());
			}
			

	}

}
