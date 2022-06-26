package Factory;

public class Shilpa extends AccountType{
	
	protected String name = "Shilpa ";
	protected double rate = 3.0;
	protected double initialDeposit = 0;
	protected String age = "Below 18";
	
	@Override
	public String toString() {
		return "{" + 
				" Name " + name+
				", Rate " + rate+
				", Intitial Deposit" + initialDeposit+
				",  Age " + age+
				" }";
	}
	
}
