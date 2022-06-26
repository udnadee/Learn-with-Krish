package Factory;

public class Savings  extends Account{
	
	protected String name= "Savings";
	 
	@Override
	protected void createType() {
		at.add(new EasyServer());
		at.add(new BigServer());
		at.add(new RealServer());
	}
	
}
