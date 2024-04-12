package assignment3;

public class BankManage {

	final String BANK_NAME="SBI";
	Customer customer[];
	Account account[];
	private static double interestRate=0.3;
	
	int MAX_SIZE=10;
	int size=0;
	
	public BankManage()
	{
		this.customer=new Customer[MAX_SIZE];
		this.account=new Account[MAX_SIZE];
	}
	
	public void addAccount(String AccNo,String name,String Address,long contactNO)
	{
		if(size<MAX_SIZE)
		{
		int i=size;
		
		account[i]=new Account(AccNo);
		customer[i]=new Customer(name, Address, contactNO, account[i]);
		size++;
		}
		else
		{
			System.out.println("Bank is Full");
		}
	}
	
	public void removeBankAccount(String no)
	{
		for(int i=0;i<size;i++)
		{
			if(account[i].accNo==no)
			{
				for(int j=i;j<size-1;j++)
				{
					account[j]=account[j+1];
					customer[j]=customer[j+1];
				}
			}
		}
		account[size]=null;
		customer[size]=null;
		size--;
	}
	
	public void displayDetails()
	{
		for(int i=0;i<size;i++)
		{
			customer[i].display();
		}
	}
	
	public void updateDetails(String AccNo, long mobNo)
	{
		for(int i=0;i<size;i++)
		{
			if(customer[i].getAccount().accNo==AccNo)
			{
				customer[i].setMobileNo(mobNo);
			}
//			else
//			{
//				System.out.println("Customer not Found");
//			}
		}
		
	}
	
	public void applyInterest(Account account1)
	{
		double interest=account1.accBalance*interestRate;
		account1.accBalance=+interest;
	}
}
