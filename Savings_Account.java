
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * o In case of a Checking Account:
▪ A Checking account should have a creation date.
▪ A Checking account should print all the account information.
▪ A Checking Account should be able to deposit and withdraw money for the account
balance given.
▪ In case of withdrawal, if the amount to be withdrawn is larger than the account balance,
the transaction should not execute 
*/

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class Savings_Account  extends Account {
	private final double INTEREST_FOR_2_MONTHS = 1.004; //1+(0.05/12)
	private final double INTEREST_FOR_4_MONTHS = 1.008; // 1+(0.1/12)
	private final double INTEREST_FOR_OVER_4_MONTHS = 1.01; //1+(0.12/12) 
private LocalDate creation_date;
private LocalDate curr_date = LocalDate.now();
private String type = "Savings";
private double interest;
	public Savings_Account(String account_id, double account_balance, LocalDate creation_date) {
		super(account_id, account_balance);
		this.creation_date = creation_date;
		this.account_id = account_id;
		this.account_balance =account_balance;
	}
	

	
	
	
	
	 

	//Assuming interest is annual. So 1% interest monthly. 
	//Calculating interest with type FutureValue  = Value * ( 1 + interestRate/12) ^ monthsOpen 
	public void add_interest(int month)
	{
		 curr_date = curr_date.withMonth(curr_date.getMonthValue()+month); //month is explicitly saying that i want to calculate interest for that number of months that have passed from the creation date. 
		 long monthsOpen = ChronoUnit.MONTHS.between(creation_date, curr_date); //calculates how many months have passed between to LocalDate dates.
		 System.out.println("Months passed: " + monthsOpen);
		 if(monthsOpen>0)
		 {
				 if(monthsOpen <= 2)
				 {
					 account_balance  = account_balance * Math.pow(INTEREST_FOR_2_MONTHS, monthsOpen);
					
				 }else if(monthsOpen<=4) {
					 account_balance  = account_balance * Math.pow(INTEREST_FOR_4_MONTHS, monthsOpen);
						
		
				 }else 
					 account_balance  = account_balance * Math.pow(INTEREST_FOR_OVER_4_MONTHS, monthsOpen);
		
		 }
	}
	
	
	public LocalDate getCreationDateChecking(LocalDate creation_date)
	{
		return this.creation_date;
	}
	public void setSavings_Balance(double account_balance)
	{
		this.account_balance = account_balance;
	}
	public double getSavings_balance()
	{
		return this.account_balance;
	}
	
	
	public void printInfoSavings()
	{
		
		System.out.println("SAVINGS ACCOUNT INFO:\n________________________________________________________________\n|ID: " + getAccount_id() 
		+ "|\t|Balance: " + getAccountBalance() + "$|"  + "\t|Created on: " + creation_date+"|" + "\n________________________________________________________________");
		
	}
	
}
