package chain.of.responsibilities;

public class FiveThousand extends Handler{

	@Override
	public BankAccount Withdraw(BankAccount account) {
		
		int reqAmount = account.getRemainAmountTOIssueNotes();
		int noteIssued = reqAmount /5000;
		int pendingAmount = reqAmount % 5000;
		
		if(noteIssued > 0 ) {
			System.out.println(noteIssued + " RS.5000 notes are issued");
		}
		
		if(pendingAmount > 0) {
			account.setRemainAmountTOIssueNotes(pendingAmount);
			 successor.Withdraw(account);
		}
		
		return account;
	}
}
