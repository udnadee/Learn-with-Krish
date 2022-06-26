package chain.of.responsibilities;

public class App {

	public static void main(String[] args) {
		
		FiveThousand fiveThousand = new FiveThousand();
		Thousand thousand = new Thousand();
		FiveHundred fiveHundred = new FiveHundred();
		Hundred hundred = new Hundred();
		Notes notes = new Notes();
		
		notes.setSuccessor(fiveThousand);
		fiveThousand.setSuccessor(thousand);
		thousand.setSuccessor(fiveHundred);
		fiveHundred.setSuccessor(hundred);
		
		BankAccount account1=new BankAccount(1,6000);
        BankAccount account2=new BankAccount(2,8900);
        BankAccount account3=new BankAccount(3,10000);
        BankAccount account4=new BankAccount(4,3444);
        
        System.out.println(notes.Withdraw(account1));
        System.out.println(notes.Withdraw(account2));
        System.out.println(notes.Withdraw(account3));
        System.out.println(notes.Withdraw(account4));
	}

}
