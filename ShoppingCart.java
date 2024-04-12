package assignment3;

class Product
{
	private String  name;
	private double price;
	private  int productid=0;
	private double total;
	
	public Product(String name,double price) {
		super();
		this.name = name;
		this. price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid() {
		this.productid = productid+1;
	}
	
	public void setTotal()
	{
		total= price * productid;
	}
	public double getTotal()
	{
		return total;
	}

	@Override
	public String toString() {
		return "\nproduct name : " + name 
			 + "\nprice        : " + price 
			 + "\nproductid    : " + productid 
			 + "\ntotal        : "+ total;
	}
	
}
class ShoppingCart 
{
	public static void main(String[] args) {
		 double totalCost=0;
   Product product []=new  Product[3];
   product [0]= new  Product("Cookies", 50.23);
   product [1]= new  Product("Ice-Cream", 150);
   product [2]= new  Product("Gulabjamun",550);
		
   for (int i = 0; i < product.length; i++) 
   {
	   product[i].setProductid();
	  product[i].setTotal();
	  totalCost = totalCost +product[i].getTotal();
   }
   for (int i = 0; i < product.length; i++) 
   {
	   
	   System.out.println(product[i]);
   }
		
System.out.println("\ntotal bill   : "+totalCost);
   
	}
	
	
}