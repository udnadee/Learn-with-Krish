package chain.of.responsibilities;

public class Hundred extends Handler{

	@Override
	public BankAccount Withdraw(BankAccount account) {
		
		int reqAmount = account.getRemainAmountTOIssueNotes();
		int noteIssued = reqAmount /100;
		int pendingAmount = reqAmount % 100;
		
		if(noteIssued > 0 ) {
			System.out.println(noteIssued + " RS.100 notes are issued");
			
		}
		
		if(pendingAmount > 0) {
			account.setRemainAmountTOIssueNotes(pendingAmount);
			successor.Withdraw(account);
		
		}
		
		return account;
	}
}
