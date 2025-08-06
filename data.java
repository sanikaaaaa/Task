package Taks1;
class Employee 
{
int empId;
String name;
double salary;
int bonus;
double totalsalary;



public Employee(int empId, String name, double salary,int bonus,double totalsalary) 
{
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.bonus = bonus;
	this.totalsalary = totalsalary;
	
	
}

public double calculateBonus() 

{
	return salary *0.10;
}

public double totalAmount() {
	
	
	return totalsalary+calculateBonus();
}
public void displayDetails()
{
	double bonus = calculateBonus();
	System.out.println();
	System.out.println("EmpId is :" + empId);
	System.out.println("Name is :" + name);
	System.out.println("Salary :" + salary);
	System.out.println("Bonus :" + bonus);
	System.out.println("Total salary" + totalAmount());
}
}

public class data{
public static void main(String args[] ){
	
	
	
	
	Employee Emp1 = new Employee(1,"sanika",1000,100,9000);
	Employee Emp2 = new Employee(2,"richa" ,2000,100,9000);
	Employee Emp3 = new Employee(3,"siddhi",3000,100,9000);
	
	
	Emp1.displayDetails();
	Emp2.displayDetails();
	Emp3.displayDetails();
	
	
	
	
}


}

