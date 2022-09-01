import java.util.Scanner;

abstract class Account   //parent class
{
	abstract void getbalance();
	abstract void depositeAmount();
	abstract void withdrawAmount();
}
class CurrentAc extends Account   //Child class
{
	 void getbalance() {
		 
		 System.out.println("Balance is: 1000 rupees");
		 
	 }
	 void depositeAmount()
	 {
		 System.out.println("Transaction charges are 10 rupees per transaction");
		 
	 }
	 void withdrawAmount()
	 {
		 System.out.println("Transaction charges are 10 rupees per transaction");
		 
	 }
}
class SavingAc extends Account  //child class
{
	void getbalance()
	{
		
		 System.out.println("Balance is 1000 rupees");
		
	}
	void depositeAmount()
	{
		System.out.println("No Transaction fee");
	}
	void withdrawAmount()
	{
		System.out.println("No transaction fee");
	}
}
public class UseAccount {
	/*
	 * Define class Account and it has two subclass CurrentAc and SavingsAc, 
	 * Saving account and Current Account has three method getBalance , 
	 * depositeAmount,WidrawAmount(Abstract method implements by subclass), 
	 * Savings account has no transaction fee but current Account
	 *  has transaction Fee 10 rupees per transaction in Bank.
	 */

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Taking Account type From the user
		System.out.println("Enter Account type \n CurrentAccount \n Saving Account"); 
		String name = in.nextLine();
		//Taking Account number from the user
		System.out.println("Enter Account Number");
		int acNumber = in.nextInt();
		//Asking for operation
		System.out.println("What do want to perform\n1.Get Balance\n2.Withdraw Money\n3.DepositeMoney");
		int op = in.nextInt();
		
		
		//Conditions according to operation
		if(name.equals("CurrentAccount")&&op==1)
		{
			CurrentAc  c1 = new CurrentAc();
			c1.getbalance();
		}
		else if(name.equals("CurrentAccount")&&op==2)
		{
			CurrentAc  c1 = new CurrentAc();
			c1.withdrawAmount();
		}
		else if(name.equals("CurrentAccount")&&op==3)
		{
			CurrentAc  c1 = new CurrentAc();
			c1.depositeAmount();
		}
		else if(name.equals("SavingAccount")&&op==1)
		{
			SavingAc  c1 = new SavingAc();
			c1.getbalance();
		}
		else if(name.equals("SavingAccount")&&op==2)
		{
			SavingAc  c1 = new SavingAc();
			c1.withdrawAmount();
		}
		else if(name.equals("SavingAccount")&&op==3)
		{
			SavingAc  c1 = new SavingAc();
			c1.depositeAmount();
		}
		else
			System.out.println("Wrong choice");

	}

}
