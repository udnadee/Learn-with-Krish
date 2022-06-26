package Factory;

public class RealServer extends AccountType{
	
	
	protected String name = "Real Server";
	protected double rate= 2.25;
	protected double initialDeposit = 1000;
	protected String age ="18+";
	
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
