package Taks1;

import java.util.HashMap;
import java.util.Scanner;

class Product{
	
}


class Product2{
	int id;
	String name;
	String quality;
	int price;
	public Product2(int id, String name, String quality, int price) {
	
		this.id = id;
		this.name = name;
		this.quality = quality;
		this.price = price;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getQuality() {
		return quality;
		
	}
	public int getPrice() {
		return price;
	}
	public void dis() {
		System.out.println("Id of Product  : " + id);
		System.out.println("Name of Product :" + name);
		System.out.println("Quality of Product :"+quality);
		System.out.println("Price of Product:" + price);
		
		
		
		
		
	}

	
}

public class Pharmacy_Managenment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Product2> data = new HashMap<>();
		
		while(true) {
			System.out.println("1.AddProduct");
			System.out.println("2.UpdateProduct");
			System.out.println("3.SerachProduct");
			System.out.println("4.Display All Products");
			System.out.println("5.End");
			
		
		
		int choice=sc.nextInt();
		sc.nextLine();
		
		
		switch(choice) {
		case 1:
		System.out.println("Enter id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Quality");
		String quality = sc.nextLine();
		
		System.out.println("Enter price");
		int price = sc.nextInt();
		sc.nextLine();
		
		
        Product2 newProduct = new Product2(id, name, quality, price);
        data.put(id, newProduct);
        System.out.println("Product added successfully.");
        
        break;
		
		case 2:
		System.out.println("Enter Product id to update");
		int updateid=sc.nextInt();
		sc.nextLine();
		
		if(data.containsKey(updateid)) {
			System.out.println("Enter new Product Name:");
			String newProductName = sc.nextLine();
			
			
			System.out.println("Enter new quality:");
			String newQuality  = sc.nextLine();
			
			System.out.println("Enter new Price:");
			int newPrice = sc.nextInt();
			sc.nextLine();
			
			Product2 newProductUp = new Product2(updateid, newProductName, newQuality, newPrice);
			data.put(updateid, newProductUp);
			System.out.println("Product updated!!");
			
		  }
			
			else {
				System.out.println("Product not found");
			}
		     break;
			
		
		case 3:{
			System.out.println("Enter product id to search");
			int searchId =sc.nextInt();
			sc.nextLine();
			
			
			Product2 Product = data.get(searchId);
			if(Product != null) {
				Product.dis();
				
			}
			
			else {
				System.out.println("Product not found");
			}
		}
		break;
		case 4 :
			if(data.isEmpty()) {
				System.out.println("No product found");
			}
			else {
				
		        for (Product2 p : data.values()) {
		            p.dis();

			}
			}
		   break;
		        
		        
			case 5:{
		        	System.out.println("End");}
			        sc.close();
		        }
		}
		
		
		
		
	
		}	

	}


