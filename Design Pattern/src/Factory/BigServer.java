package Factory;

public class BigServer extends AccountType{

	protected String name = "Big Server";
	protected double rate= 2.25;
	protected double initialDeposit = 25000;
	protected String age = "18+";
	
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
