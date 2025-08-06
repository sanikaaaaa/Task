package Taks1;

import java.util.ArrayList;


class Product {
int productid;
String productName;
int price;
public Product(int productid, String productName, int price) {
	super();
	this.productid = productid;
	this.productName = productName;
	this.price = price;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return productid + productName +price;
	
}
}
class Cart{
	ArrayList<Product> productList=new ArrayList<>();
	//Add product to cart
	
	public void addProduct(Product product) {
	productList.add(product);
	System.out.println(product.productName+ "added to cart");
	
	productList.remove(product);
	
	
	
	
	System.out.println(product.productName+ "remove from cart");
	
	
	}
	
	
	
	
	

}
public static void main(String args[]) {
	
}

}
}


