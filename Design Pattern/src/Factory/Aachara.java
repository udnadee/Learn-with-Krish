package Factory;

public class Aachara extends AccountType{

	protected String name = "Aachara ";
	protected double rate= 15.0;
	protected double initialDeposit= 200;
	protected String age= "55+";
	
	@Override
	public String toString() {
		return "{" + 
				"Name " + name+
				", Rate " + rate+
				", Intitial Deposit" + initialDeposit+
				", Age " + age+
				" }";
	}
}
