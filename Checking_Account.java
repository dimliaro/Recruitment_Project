import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Checking_Account extends Account {
	public Checking_Account(String account_id, double account_balance) {
		super(account_id, account_balance);
		this.account_id = account_id;
		this.account_balance = account_balance;
	}

	private LocalDate creation_date; 
	
	public Checking_Account(String account_id, double account_balance, LocalDate creation_date) {
		super(account_id, account_balance);
		this.creation_date = creation_date;
	}
	
	
	public LocalDate getCreationDateSavings(LocalDate creation_date)
	{
		return this.creation_date;
	}
		public void printCheckingInfo()
		{
			System.out.println("CHECKING ACCOUNT INFO:\n________________________________________________________________\n|ID: " + getAccount_id() 
			+ "|\t|Balance: " + getAccountBalance() + "$|"  + "\t|Created on: " + creation_date+"|" + "\n________________________________________________________________");
		}
	}

