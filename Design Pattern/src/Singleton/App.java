package Singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader( new FileReader("demo_log.txt"));
		
		Logger log1 = Logger.getLogger();
		Logger log2 = Logger.getLogger();
		
		System.out.println(log1);
		System.out.println(log2);
		System.out.println(" ");
		
		log1.logDeposit("0001", 80.5);
		log2.logDeposit("0002",100);
		log1.logDeposit("0001", 30.5);
		log2.logWithdraw("0002",50);
		
		String line;
		while((line = in.readLine()) != null)
		{
		    System.out.println(line);
		}
		in.close();
		
	}

}
