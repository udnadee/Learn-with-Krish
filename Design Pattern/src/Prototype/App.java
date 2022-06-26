package Prototype;

import Prototype.Types.ModelType;

public class App {

	public static void main(String[] args) {
		try 
		{
			String moviePrototype  = Types.getInstance(ModelType.MOVIE).toString();
			System.out.println(moviePrototype);
			
			String albumPrototype  = Types.getInstance(ModelType.ALBUM).toString();
			System.out.println(albumPrototype);
			
			String showPrototype  = Types.getInstance(ModelType.SHOW).toString();
			System.out.println(showPrototype);
			
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
