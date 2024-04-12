package assignment3;

public class Customer {

	String name;
	String address;
	long mobileNo;
	Account account;
	
	public Customer(String name, String address, long mobileNo, Account account) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void withdraw(double amt)//we not show account class to user thats why we create same mathod
	{
		account.withdraw(amt);
	}
	public void deposite(double amt)
	{
		account.deposite(amt);
	}
	
	public void display()
	{
		System.out.println("Customer Name : "+name);
		System.out.println("Customer address : "+address);
		System.out.println("Customer MoNo : "+mobileNo);
		System.out.println("Account Number : "+account.accNo);
		System.out.println("Account balance : "+account.getBalance());
	}
	
	public void fundTransfer(Account account1,double amt)
	{
		if(this.account.getBalance()>amt)
		{
			this.account.withdraw(amt);
			System.out.println("Amount withdraw Successfully");
			account1.deposite(amt);
			System.out.println("Amount transfer Successfully");
			
		}
	}
	
	
}
