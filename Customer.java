/*
 * o A customer should have a first name, last name, email and his/her/their accounts. The e-mail
value should be validated for human error (it should be a string with a valid email).

o A customer should be able to add an account, remove an account, print all his/her/their account
information.
*/
import java.util.ArrayList;
public class Customer {
private String first_name;
private String last_name;
private String email; 
private int account_id;
private String branch_name;
private ArrayList<Account> accounts; 

	public Customer(String first_name, String last_name, String email, int account_id)
{
	this.first_name = first_name;
	this.last_name = last_name;
	this.email = email;
	this.account_id = account_id;
	
	 this.accounts = new ArrayList<>();
}
	
	
	
	public void addAccount(Account account) 
	{
		accounts.add(account);
	}
	public void removeAccount(Account account)
	{
		accounts.remove(account);
	}
	
	public void printAllAccounts()

	{
		System.out.println("Customer: " + this.getFirstName() + " " + this.getLastName() + "Mail: " + this.getEmail());
		for(Account account: this.accounts)
		{
			account.printAccountInfo();
		}
	}
	

	
	
	
	
	
public boolean isMailValid()
{
	try {
		if(email.charAt(0)  != '@')
		{
			if(email.contains("@") && email.endsWith(".com"))
			{
				System.out.println("Mail is valid!");
				return true;
			}
		}else {
			throw new Exception();
		}
		}//end try
	catch(Exception e){
			System.out.println("Not a valid email form. Please check Customer Creation");
			System.exit(0);
			}
	
	return false;
}
public String getFirstName()
{
	return first_name;
}

public String getLastName()
{
	return last_name;
}

public String getEmail()
{
	return email;
}

public int getAccountId()
{
	return account_id;
}
//Using this method to add branch 
public void setBranchName(String branch_name) {

	this.branch_name = branch_name;
	
}



public void printCustomerInfo() {
	System.out.println("Hello " + getFirstName() + " " + getLastName() + ". You entered this mail: " + getEmail());
	
}

}