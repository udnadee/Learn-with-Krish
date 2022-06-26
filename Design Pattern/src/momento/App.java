package momento;

public class App {

	public static void main(String[] args) {
	
		CareTaker careTaker  = new CareTaker();
		Book book = new Book();
		
		book.addPage(new Pages(1,"There was a boy named John who was so lazy, he couldn’t even bother to change his clothes. "));
		careTaker.save(book);
		System.out.println(book);
		
		book.addPage(new Pages(2, " One day, he saw that the apple tree in their yard was full of fruits."));
		careTaker.save(book);
		System.out.println(book);
		
		book.addPage(new Pages(0, "He wanted to eat some apples but he was too lazy to climb the tree and take the fruits. "));
		careTaker.save(book);
		System.out.println(book);
		
		book.addPage(new Pages(0, "So he lay down underneath the tree and waited for the fruits to fall off. "));
		careTaker.revert(book);
		System.out.println(book);
		
		book.addPage(new Pages(0, "So he lay down underneath the tree and waited for the fruits to fall off. "));
		careTaker.save(book);
		System.out.println(book);
		
		book.addPage(new Pages(0, "John waited and waited until he was very hungry but the apples never fell."));
		System.out.println(book);
	}

}
