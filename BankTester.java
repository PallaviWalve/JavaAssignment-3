package assignment3;

import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {

		BankManage banker = new BankManage();
		banker.addAccount("SA202413", "Pallavi","nashik", 4587290);
		banker.addAccount("SA202414", "Sonali", "mumbai", 5487240);
		banker.addAccount("SA202416", "Prashant","nsk", 4589760);
		banker.addAccount("SA202419", "Punit", "pune", 54872745);
	
		System.out.println("-----WELCOME TO SBI-----");
		System.out.println("Select the role :\n1.Customer\n2.Banker");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		if (ch == 1) {
			System.out.println("Enter your name");
			String name = sc.next();
			for (int i = 0; i < banker.size; i++) {
				if (name.equalsIgnoreCase(banker.customer[i].getName())) {
					int choice;
					do {
					System.out.println("---------MENU----------");
					System.out.println("1.Display Details\t2.Withdraw\t3.Deposite\t4.Fund Transfer");
					choice = sc.nextInt();
					switch (choice) {
					case 1: {
						banker.customer[i].display();
						break;
					}
					case 2: {
						System.out.println("Enter amount to withdraw");
						double amt = sc.nextDouble();
						banker.customer[i].withdraw(amt);
						break;
					}
					case 3: {
						System.out.println("Enter amount to deposite");
						double amt = sc.nextDouble();
						banker.customer[i].deposite(amt);
						break;
					}
					case 4: {
						System.out.println("Enter the accNo for transfer");
						String accNo = sc.next();
						boolean flag=false;
						for (int k = 0; k < banker.size; k++) {
							if (accNo.equalsIgnoreCase(banker.customer[k].getAccount())) {
								flag=true;
								System.out.println("Enter amount to transfer");
								double amt = sc.nextDouble();
								banker.customer[i].fundTransfer(banker.account[k], amt);
								break;
							}
							
						}
						if(!flag)
						{
							System.out.println("not found");
						}

						break;
					}
					case 5: {
						
						break;
					}
					default:
					{
						System.out.println("You have entered wrong choice");
					}
					}
					}
					while(choice!=5);
				}
				else
				{
					
				}
				
			}

		} else {

	

	}

	}
}
