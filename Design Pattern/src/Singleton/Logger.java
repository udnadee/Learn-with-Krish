package Singleton;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
	
	private static Logger logger = null ;
	private final String logFile = "demo_log.txt"; 
	
	private PrintWriter writer;
	
	private Logger() {
		
		try {
			FileWriter fw = new FileWriter(logFile);
		    writer = new PrintWriter(fw, true);
		} catch (IOException e) {}
	}
	
	public static Logger getLogger() {
	if (logger == null) {
		//double checking singleton
		synchronized (Logger.class) {
			if (logger == null) {
				logger = new Logger();
				}
			}
		}
		return logger;
	}
	
	public void logDeposit(String acc, double amount) {
		writer.println("Deposit (" + acc + "): " + amount + "$");
	}
	
	public void logWithdraw(String acc, double amount) {
		writer.println("Withdraw (" + acc + "): " + amount + "$");
	}
	
}
