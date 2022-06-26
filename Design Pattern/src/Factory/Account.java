package Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {

	protected List<AccountType> at = new ArrayList<>();
	protected String type;
	
	 public Account() {
		createType();
	}
	
	 
	 protected abstract void createType();

	@Override
	 public String toString() {
			return "{" + 
					" " + at+
					"}";
		}
}
