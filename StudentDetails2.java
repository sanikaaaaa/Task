package Taks1;
import java.util.HashMap;
import java.util.Scanner;

class stu{
	private int id;
	private String name;
	private int marks;
	private String Grade;
	public stu(int id, String name, int marks, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.Grade = grade;
		
		
	}
	public void display() {
		System.out.println("Id of Student" + id);
		System.out.println("Name of Student" + name);
		System.out.println("Marks of Student" + marks);
		System.out.println("Grade of Student" + Grade);
	}


	
}



public class StudentDetails2 {
	public static void main(String args[]) {
	    
		Scanner sc = new Scanner(System.in);
		HashMap<stu,Integer> Students = new HashMap<stu,Integer>();
        int choice;
    
    
    
    
	switch(choice) {
	case1:
		System.out.println("Marks are above 90%");
	    break;
	    
	 case2:
		 System.out.println("Marks are around 75%");
	    break;
	    
	    
	 case3:
		 System.out.println("Marks are around 60%");
	    break;
	    
	  case4:
		  System.out.println("Marks are below 60%");
	     
	    
	}
	
	





}
}
