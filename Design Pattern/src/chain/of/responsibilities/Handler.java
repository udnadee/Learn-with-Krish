package chain.of.responsibilities;

public abstract class Handler {
	
	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}
	
	public abstract BankAccount Withdraw(BankAccount account);
}
