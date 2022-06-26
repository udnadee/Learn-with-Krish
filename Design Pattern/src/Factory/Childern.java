package Factory;

public class Childern extends Account{

	@Override
	protected void createType() {
		at.add(new Shilpa());
		at.add(new ChildrensSeving());
	}

}
