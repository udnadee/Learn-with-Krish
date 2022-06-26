package momento;

import java.util.Stack;

public class CareTaker {
	

	Stack<Book.BookMomento> history = new Stack<>();
	
	public void save(Book book) {
		history.push(book.save());
	}
	

	public void revert(Book book) {
		if(!history.isEmpty()) {
			book.revert(history.pop());
		}else {
			System.out.println("Cannot Undo");
		}
	}
}
