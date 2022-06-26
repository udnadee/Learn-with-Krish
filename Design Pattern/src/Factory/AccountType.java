package Factory;

public abstract class AccountType {
	protected String name;
	protected double rate;
	protected double initialDeposit;
	protected String age;
	
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
