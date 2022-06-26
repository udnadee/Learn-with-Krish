package Factory;

public class EasyServer extends AccountType{

	
	protected String name = "Easy Server";
	protected double rate= 3.0;
	protected double initialDeposit= 1000;
	protected String age= "18+";
	
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
