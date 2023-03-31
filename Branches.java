
public class Branches extends Bank {

	
	private String name;
	public Branches(String name, String bank_name)
	{
		super(bank_name);
		this.name = name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public boolean Belongs()
	{
		if(getBankName().contains(this.name)) {
			
			return true;
		}else
			return false;
	}
	public String getName()
	{
		return name;
	}
	
	public void printBranchInfo()
	{
		System.out.println("Created a bank branch with Branch name: " + name + " \nBelongs to " + getBankName());
	}
}
