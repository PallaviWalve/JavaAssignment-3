package assignment3;
class SavingsAccount 
{
    private static double annualInterestRate = 0;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) 
    {
        this.savingsBalance = savingsBalance;
    }

    public double getSavingsBalance() 
    {
        return savingsBalance;
    }

    public void calculateMonthlyInterest() 
    {
        savingsBalance = savingsBalance + savingsBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double annualInterestRate) 
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
}


public class Main 
{
    public static void main(String[] args) 
    {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(0.04);
        
        for (int i = 0; i < 12; i++) 
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        
        System.out.println("Saver1 : " + saver1.getSavingsBalance());
        System.out.println("Saver2 : " + saver2.getSavingsBalance());
        
        SavingsAccount.modifyInterestRate(0.05);
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("Saver1 : " + saver1.getSavingsBalance());
        System.out.println("Saver2 : " + saver2.getSavingsBalance());
    }
}
