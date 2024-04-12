package assignment3;

public class SavingAccount 
{
		static double annualInterestRate;
		private double savingsBalance;
		private double interest;

		public SavingAccount(double savingBalance) {
			super();
			this.savingsBalance = savingsBalance;

		}

		public SavingAccount() {

			savingsBalance = 0.0;

		}
		public void calculateMonthlyInterest()
		{
			interest = (savingsBalance*annualInterestRate)/12;
			savingsBalance = interest + savingsBalance;
		}
		public static void setAnnualInterestRate(double annualInterestRate)
		{
			SavingAccount.annualInterestRate=annualInterestRate/100;
		}
		

		@Override
		public String toString() {
			return "SavingsAccount [savingsBalance=" + savingsBalance + ", interest=" + interest + "]";
		}

		public static void main(String[] args) {
			 SavingAccount sa = new  SavingAccount(20000);
			 SavingAccount.setAnnualInterestRate(3);
			 sa.calculateMonthlyInterest();
			 System.out.println(sa);
			 SavingAccount.setAnnualInterestRate(4);
			 sa.calculateMonthlyInterest();
			 System.out.println(sa);

		}

	}



