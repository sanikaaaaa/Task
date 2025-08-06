package Taks1;

class Student {
	int rollno;
	String name;
	int marks;
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public void getGrade() {
		if(marks >= 90) {
			System.out.println("If Marks are above 90% -A is Grade" );
		}
			
		else if (marks >=75){
				System.out.println("If Marks are 75% - B is Grade");
			}
			
		else if (marks>=60) {
				System.out.println("If Marks are 60% - C is Grade");
			}
			else {
				System.out.println("If Marks are less than 60 - D is Grade");
			}
	}
		
		public void showDetails() {
			System.out.println("Rollno :" +rollno);
			System.out.println("Name : " + name);
			System.out.println("Marks :" + marks);
		}
}
	
			
			
			
	
	

public class Student_Grade {
	public static void main(String args[]){
		Student objStudent = new Student(1,"Richa",80);
		
		objStudent.showDetails();
		objStudent.getGrade();
		
		
		
		
		
		
	}

}

