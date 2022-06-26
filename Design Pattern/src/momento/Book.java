package momento;

import java.util.ArrayList;

public class Book {
	
	ArrayList<Pages> pages = new ArrayList<>();
	ArrayList<Pages> read = new ArrayList<>();
	ArrayList<Pages> undoread = new ArrayList<>();
	
	public void addPage(Pages page) {
		pages.add(page);
	}

	public ArrayList<Pages> getPages() {
		return (ArrayList<Pages>) pages.clone();
	}
	
	public BookMomento save() {
		return new BookMomento(getPages());
	}
	
	public void revert (BookMomento momento) {
		pages = momento.getPages();
	}
	
	@Override
	public String toString() {
		return "Cart [items=" + pages + "]";
	}
	//momento
	static class BookMomento{
		ArrayList<Pages> pages;

		public BookMomento(ArrayList<Pages> page) {
			this.pages = page;
		}
		
		private ArrayList<Pages> getPages() {
			return pages;
		}
	}
}
