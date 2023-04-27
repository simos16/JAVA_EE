package it.simo.log.logger;

import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {
	
	 private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	 
	 public void mioMetodo() {
	      
		 	System.out.println(3 + 2);
	        
	        // impostazione del livello
	        LOGGER.setLevel(Level.SEVERE);
	        LOGGER.severe("Info Log");
	        LOGGER.warning("Info Log");
	        LOGGER.info("Info Log");
	        LOGGER.finest("Really not important");

	        
	        LOGGER.setLevel(Level.INFO);
	        LOGGER.severe("Info Log");
	        LOGGER.warning("Info Log");
	        LOGGER.info("Info Log");
	        LOGGER.finest("Si può saltare");
	    }
	

	public static void main(String[] args) {
		LoggerTest tester = new LoggerTest();
        try {
            MyLog.setup();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problemi con la creazione del file");
        }
        tester.mioMetodo();

	}

}
