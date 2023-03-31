import java.time.LocalDate;
import java.util.*;
public class Main {

	
		public static void main (String[] args)
		{
		
			Bank bank = new Bank("Alpha Bank");
			System.out.println("Hello, welcome to " + bank.getBankName() + "!");
			Customer c = new Customer ("John" ,  "Doe ", "JohnDoe@example.com", 1001); //John being registered
			c.printCustomerInfo();
			System.out.println("Checking if email is in valid form\n...............");
			c.isMailValid();
			bank.addCustomer(c,"Kifisia Branch"); //into bank's list in Branch of Kifissia
			bank.print_customers();
			
			
			Savings_Account savings_account = new Savings_Account("SA1001", 0,  LocalDate.now());//Create an Account 
			c.addAccount(savings_account); //add the account to Customer's List of accounts
			System.out.println("Savings account created for " + c.getLastName());
			System.out.println("Depositing on savings account with id: " +  savings_account.getAccount_id());
			savings_account.deposit(200);
			savings_account.printInfoSavings();
			
			Checking_Account checking_account  = new Checking_Account("CA2001", 0, LocalDate.now()); //Create another Account
			System.out.println("Checking account created for" + c.getLastName());
			c.addAccount(checking_account); // add the second Account into Customer's List as well
			System.out.println("Depositing on checkings account with id: " + checking_account.getAccount_id());
			checking_account.deposit(145);//1st account deposits 145
			checking_account.printCheckingInfo();
			
			Checking_Account checking_account2  = new Checking_Account("CA2002", 0, LocalDate.now()); //Create another Account
			System.out.println("Checking account created for" + c.getLastName());
			c.addAccount(checking_account2); // add the second Account into Customer's List as well
			
			    System.out.println("Depositing on account with id:  " + checking_account2.getAccount_id());
				checking_account2.deposit(160);//2nd account deposits 160
				checking_account2.printCheckingInfo();//print 2nd acc's info
			    System.out.println("Depositing on account with id:  " + checking_account2.getAccount_id());
				checking_account.deposit(20);//1st acc deposits 20
			    System.out.println("Trying to withdraw on account with id:  " + checking_account.getAccount_id());

				checking_account.withdraw(180);//1st acc tries to withdraw 180
			    System.out.println("Trying to withdraw on account with id:  " + checking_account.getAccount_id());

				checking_account.withdraw(150);//1st acc tries to withdraw 150
				checking_account.printCheckingInfo();
				
			    System.out.println("Trying to calculate savings account balance with interest added. Id:" + savings_account.getAccount_id());

				savings_account.add_interest(4);//this works only for the example of 4-9 months.Thats because it adds to the existing month X months with a limit to 12. So if we pass '10'
												//as a parameter, it will throw an exception because it would have a month with value 13 and thats not allowed. For it to work for every example, when i create an account 
												//i should give the date myself, and remove some code from Savings_Account line:43
				savings_account.printInfoSavings();
				

		}
}
