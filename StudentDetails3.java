package Taks1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Stu {
    private int id;
    private String name;
    private int marks;

    public Stu(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void marks_ranking() {
        if (marks >= 90) {
            System.out.println("If Marks are above 90% - A is Grade");
        } else if (marks >= 75) {
            System.out.println("If Marks are 75% - B is Grade");
        } else if (marks >= 60) {
            System.out.println("If Marks are 60% - C is Grade");
        } else {
            System.out.println("If Marks are less than 60 - D is Grade");
        }
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("Id of Student: " + id);
        System.out.println("Name of Student: " + name);
        System.out.println("Marks of Student: " + marks);
        marks_ranking();
    }
}

public class StudentDetails3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Stu> students = new HashMap<Integer,Stu>();
        
        int choice;

        do {
            System.out.println(" Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View Student by ID");
            System.out.println("3. View All Students");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();

                    Stu student = new Stu(id, name, marks);
                    students.put(id, student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Student ID to view: ");
                    int searchId = sc.nextInt();
                    Stu foundStudent = students.get(searchId);
                    if (foundStudent != null) {
                        foundStudent.display();
                    } else {
                        System.out.println(" Student not found.");
                    }
                    break;

                case 3:
                    if (students.isEmpty()) {
                        System.out.println(" No students available.");
                    } else {
                        for (Map.Entry<Integer, Stu> entry : students.entrySet()) {
                            System.out.println("\n----------------");
                            entry.getValue().display();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println(" Invalid choice. Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

