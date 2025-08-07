package Taks1;

import java.util.HashMap;
import java.util.Scanner;

class Book {
	String bookname;
	int bookprice;
	String bookautorName;
	String jaunra;

	public Book(String bookname, int bookprice, String bookautorName, String jaunra) {
		this.bookname = bookname;
		this.bookprice = bookprice;
		this.bookautorName = bookautorName;
		this.jaunra = jaunra;
	}

	public String getbookname() {
		return bookname;
	}

	int getbookprice() {
		return bookprice;
	}

	String getbookautorName() {
		return bookautorName;
	}

	String getjaunra() {
		return jaunra;
	}

	public void display() {
		System.out.println("Name of the Book :" + bookname);
		System.out.println("Price of the Book :" + bookprice);
		System.out.println("Name of the Book Author :" +bookautorName );
		System.out.println("Jaunra of the Book : " + jaunra);
	}

}

public class BookManagenment {
	
	
	public static void main(String args[]) 
	
	
	
	
	{
		Scanner sc = new Scanner(System.in);

		HashMap<String, Book> details = new HashMap<>();
		
        while(true)
        
        
        {
        	
		System.out.println("1.BookDetails: ");
		System.out.println("2.CheckBooks");
		System.out.println("3.Display All Books");
	  
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice) 
		
		
		{
        
		case 1:
		System.out.println("Enter Name of the book");
		String bookname = sc.nextLine();
		
		System.out.println("Enter Price of Book");
		int bookprice = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("Enter Name to Author");
		String bookautorName = sc.nextLine();
		
		System.out.println("Enter Type of Book");
		String jaunra = sc.nextLine();
		
		Book information = new Book(bookname, bookprice, bookautorName, jaunra);
		details.put(bookname,information);
		System.out.println("Added");
		break;

		
		
        
		case 2:
			System.out.println("Check Book");
			System.out.println("Serach according to Name of author");
			String searchBookName = sc.nextLine();
			
			Book book = details.get(searchBookName);
			
			if(book !=null) {
				System.out.println();
				book.display();
				
				
			}
			
			else {
				
				System.out.println("book data not found ");
			}
			break;
			
			
		case 3:
			if(details.isEmpty()) {
				System.out.println("No product found");
			}
			else {
				
		        for (Book p : details.values()) {
		            p.display();

			}
			}
		   break;
		   
		case 4:
		{
			System.out.println("End");
			sc.close();
			break;
		}
	    }
        
        
        
        
        
        
        
        
        }	

		
}
}

