//Write a program to print the area and perimeter of a
//triangle having sides of 3, 4 and 5 units by creating a 
//class named &#39;Triangle&#39; with parameter in itsconstructor.

package assignment3;

public class Triangle 
{

	private double side1;
	private double side2;
	private double side3;
	private double peri;
	private double area;
	
	public Triangle(double side1, double side2, double side3) 
	{

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double calPerimeter()
	{
		return peri=side1+side2+side3;
	}
	public double calArea()
	{
		double s=peri/2;
		area=(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
		return area;
	}
	public void printDetails()
	{
		System.out.println("Side1     : "+side1);
		System.out.println("Side2     : "+side2);
		System.out.println("Side3     : "+side3);
		System.out.println("Perimeter : "+calPerimeter());
		System.out.println("Area      : "+calArea());
	}


	public static void main(String[] args) {
		Triangle triangle = new  Triangle(4.0, 5.0, 3.0);
		triangle.printDetails();
		
	}

}
