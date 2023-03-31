import java.util.ArrayList;

/*
 * Bank
o A Bank should have a Bank Name.

o A Bank could have one or more Bank Branches. (For example: Test Bank Kifissia Branch, Test
Bank Marousi Branch, Test Bank Cholargos Branch etc.)

o Each branch should have a name.

o A Bank should be able to add or remove a customer and print all customers.

*/
public class Bank {

	private String bank_name;
	private ArrayList<Customer> customers;
	private ArrayList<Branches> branches = new ArrayList<>();
	
	public Bank(String bank_name)
	{
		this.bank_name = bank_name;
		this.customers = new ArrayList<>();
	}
	public void addCustomer(Customer customer, String branch_name)
	{
		customer.setBranchName(branch_name);
		Branches branch  = new Branches(branch_name , bank_name);
		branches.add(branch);
		printBranches();
		branch.printBranchInfo();
		customers.add(customer);
	}
	public void removeCustomer(Customer customer, String branch_name)
	{
		
		customers.remove(customer);
	}
	public void print_customers()

	{
		System.out.println("Here is a list of " + getBankName() + " customers:\n");
		for(Customer c: this.customers)
		{
			System.out.println(c.getFirstName() + " " +  c.getLastName());
			
		}
	}
	public void printBranches()

	{
		System.out.println("Here is a list of " + bank_name+" branches\n");
		for(Branches b: branches)
		{
			System.out.println( b.getName() );
			
		}
	}
	
	
	
	
	
	public String getBankName()
	{
		return bank_name;
	}
	
	
}
