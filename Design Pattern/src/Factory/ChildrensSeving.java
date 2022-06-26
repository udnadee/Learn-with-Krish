package Factory;

public class ChildrensSeving extends AccountType{
	

	protected String name= "Children's Savings Planner";
	protected double rate = 5.50;
	protected double initialDeposit= 1000;
	protected String age= "Below 18";

	@Override
	public String toString() {
		return "Types{" + 
				"Name " + name+
				"Rate " + rate+
				"Intitial Deposit" + initialDeposit+
				"Age " + age+
				"}";
	}
}
