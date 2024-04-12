package assignment3;
public class Account {

	String accNo;
	double accBalance;

	public Account(String accNo)
	{
		this.accNo=accNo;
		this.accBalance=0;
	}
	
	public void withdraw(double amt)
	{
		if(accBalance>amt)
		{
			accBalance=accBalance-amt;
			System.out.println(amt+" Withdraw Successfully");
		}
		else
		{
			System.out.println("Insuficiant balance");
		}
		
	}
	
	public void deposite(double amt)
	{
		accBalance=accBalance+amt;
		System.out.println("Deposite amount Successfully");
	}
	
	public void display()
	{
		System.out.println("AccBalance : "+accBalance);
		System.out.println("AccNumber : "+accNo);
	}
	
	public double getBalance()
	{
		return accBalance;
	}
}
