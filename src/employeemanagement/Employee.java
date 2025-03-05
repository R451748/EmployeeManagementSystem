package employeemanagement;

import java.util.ArrayList;
import java.util.List;

public class Employee {
private int id;
private String name;
private double salary;
public Employee(int id, String name, double salary) {
	this.id = id;
	this.name = name;
	this.salary = salary;
}	
public void displayDetails() {
    System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
}
public static void main(String[] args) {
	List<Employee> employees= new ArrayList<>();
	employees.add(new Employee(1, "Rohit",50000));
	employees.add(new Employee(2, "Virat",55000));
	employees.add(new Employee(3, "Shreyas",60000));
	for(Employee emp: employees) {
		emp.displayDetails();
	}
}
}