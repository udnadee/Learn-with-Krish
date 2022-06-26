package Factory;

public class AccountFactory {
	public static Account accountType(AccountCode ac) {
		switch (ac) {
		case SAVINGS:
			return new Savings();	
		case SENIOR:
			return new SeniorCitizen();	
		case CHLDREN:
			return new Childern();	
		default:
			return null;
		}
		
	}
}
