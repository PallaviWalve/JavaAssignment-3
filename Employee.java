package assignment3;
import java.util.Scanner;

class Employee
{
	private String name;
	private double salary, hours;
	
	public Employee() {
		name = " ";
		salary = 0;
		hours = 0;
	}
	
	public void getInfo(String n, double sal, double hr) {
		name = n;
		salary = sal;
		hours = hr;
	}
	
	public double AddSal() {
		if(salary<500) {
			salary = salary + 10;
		}
		return salary;
	}
	
	public double AddWork() {
		if(hours > 6) {
			salary = salary + 5;
		}
		return salary;
	}
}

class TestEmployee {
	double salary;
	
	public TestEmployee(double sal) {
		salary = sal;
	}
	
	public void printSal() {
		System.out.println("Salary : " + salary);
	}
}

class EmployeeDetail
{
	public static void main (String[] args)
	{
		Employee emp = new Employee();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		System.out.println("Enter no. of hours of work");
		double hours = sc.nextDouble();
		

		emp.getInfo(name, salary, hours);
		salary = emp.AddSal();
		salary = emp.AddWork();
		
		TestEmployee test = new TestEmployee(salary);  
		test.printSal();
	}
}
