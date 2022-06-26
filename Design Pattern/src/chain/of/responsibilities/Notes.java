package chain.of.responsibilities;

public class Notes extends Handler{

	@Override
	public BankAccount Withdraw(BankAccount account) {
		
		int reqAmount = account.getRequestedAmount();
		
		int amount = reqAmount % 100;
		
		System.out.println("\n");
		if(amount != 0) {
			
			System.out.println( "You need to enter amount in multiples of 100 ");
		}
		else {
			account.setRemainAmountTOIssueNotes(reqAmount);
			successor.Withdraw(account);
		}
		return account;
	}
}
