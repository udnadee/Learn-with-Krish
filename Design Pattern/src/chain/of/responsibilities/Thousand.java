package chain.of.responsibilities;

public class Thousand extends Handler{

	@Override
	public BankAccount Withdraw(BankAccount account) {
		
		int reqAmount = account.getRemainAmountTOIssueNotes();
		int noteIssued = reqAmount /1000;
		int pendingAmount = reqAmount % 1000;
		
		if(noteIssued > 0 ) {
			System.out.println(noteIssued + " RS.1000 notes are issued");
		}
		
		if(pendingAmount > 0) {
			account.setRemainAmountTOIssueNotes(pendingAmount);
			successor.Withdraw(account);
		
		}
		
		return account;
	}
}
