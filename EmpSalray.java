package Taks1;

import java.util.Scanner;

class Employee_Skbits{
	int empId;
	String name;
	double salary;
	int bonus;
	double totalsalary;
	String email;
	long number;
	double pension;
	
	
	
	public Employee_Skbits(int empId, String name, double salary, int bonus, double totalsalary,String email,long number,double pension) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
		this.totalsalary = totalsalary;
		this.email = email;
		this.number= number;
		this.pension=pension;
	}
	
public double calculateBonus(){
	return salary * 0.10;
	
}
public double TotalAmount() {
	return totalsalary = calculateBonus()+salary;
	
}
public double TotalPension() {
	return pension = + calculateBonus()+totalsalary;
	
	
}


	
}

public class EmpSalray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter id" );
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println(empId);
		
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println(name);
		
		
		System.out.println("Enter salary");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println(salary);
		
		
		System.out.println("Enter bonus");
		double bonus = sc.nextDouble();
		sc.nextLine();
		System.out.println(bonus);
		
		System.out.println("Enter total salary");
		double totalsalary=sc.nextDouble();
		sc.nextLine();
		System.out.println(totalsalary);
		
		
		System.out.println("Enter email");
		String email = sc.nextLine();
		System.out.println(email);
		
		
		System.out.println("Enter number");
		long number=sc.nextLong();
		sc.nextLine();
		System.out.println(number);
		
		
		System.out.println("Enter pension");
		double pension = sc.nextDouble();
		sc.nextLine();
		System.out.println(pension);
		
		
		
		//System.out.println(name);

		
		
		System.out.println("Data of Employee");
		
		
		
		
		

		
		

	}

}
