//Print the sum, difference and product of two complex numbers
//by creating a class, named &#39;Complex&#39; with separate 
//methods for each operation whose real and imaginary parts are 
//entered by user. Use Constructors to initialize the data members

package assignment3;

public class Complex 
{

		private int real,img,sum,diff,product;
		
		public Complex(int real, int img) {
			super();
			this.real = real;
			this.img = img;
		}
		public Complex calSum(Complex num)
		{
			int real=this.real+num.real;
			int image=this.img+num.img;
			Complex result=new Complex(real, image);
			return result;
		}
		public Complex calDiff(Complex num)
		{
			int real=this.real-num.real;
			int image=this.img-num.img;
			Complex result=new Complex(real, image);
			return result;
		}
		public Complex calMul(Complex num)
		{
			int real=this.real*num.real;
			int image=this.img*num.img;
			Complex result=new Complex(real, image);
			return result;
		}
		public void diplaySum()
		{
			System.out.println(real+"+"+img+"i");
		}
		public void diplayDiff()
		{
			System.out.println(real+"-"+img+"i");
		}
		public void diplayMul()
		{
			System.out.println(real+"*"+img+"i");
		}

		public static void main(String[] args) {
			Complex complex1=new Complex(2, 10);
			Complex complex2=new Complex(5, 4);
			System.out.println("Addition of Complex Number");
			Complex result=complex1.calSum(complex2);
			result.diplaySum();
			
			System.out.println("Subtraction of Complex Number");
			Complex result1=complex1.calDiff(complex2);
			result1.diplayDiff();
			
			System.out.println("Multplication of Complex Number");
			Complex result2=complex1.calMul(complex2);
			result2.diplayMul();
			
		}

	}
