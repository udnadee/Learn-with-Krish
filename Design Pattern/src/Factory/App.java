package Factory;

public class App {

	public static void main(String[] args) {
		
		Account account = AccountFactory.accountType(AccountCode.SAVINGS);
		Account account2 = AccountFactory.accountType(AccountCode.CHLDREN);
		Account account3 = AccountFactory.accountType(AccountCode.SENIOR);
		
		System.out.println(account);
		System.out.println(account2);
		System.out.println(account3);
	}

}
