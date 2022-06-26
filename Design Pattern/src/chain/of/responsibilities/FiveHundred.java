package chain.of.responsibilities;

public class FiveHundred extends Handler{

	@Override
	public BankAccount Withdraw(BankAccount account) {
		
		int reqAmount = account.getRemainAmountTOIssueNotes();
		int noteIssued = reqAmount /500;
		int pendingAmount = reqAmount % 500;
		
		if(noteIssued > 0 ) {
			System.out.println(noteIssued + " RS.500 notes are issued ");
		}
		
		if(pendingAmount > 0) {
			account.setRemainAmountTOIssueNotes(pendingAmount);
			successor.Withdraw(account);
		
		}
		
		return account;
	}
}
