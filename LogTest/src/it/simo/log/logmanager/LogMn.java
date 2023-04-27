package it.simo.log.logmanager;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogMn {

	  static Logger logger = Logger.getLogger(LogMn.class.getName());
	    
	    public static void main(String[] args) {
	        try {
	            LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
	        } catch (SecurityException | IOException e1) {
	            e1.printStackTrace();
	        }
	        logger.setLevel(Level.FINE);
	        logger.addHandler(new ConsoleHandler());
	        //custom handler
	        logger.addHandler(new MyHnd());
	        try {
	            //FileHandler con nome file e limiti di grandezza e numero dei file 
	            Handler fileHandler = new FileHandler("mylogger.log", 2000, 5);
	            fileHandler.setFormatter(new MyFmt());
	            //custom filter 
	            fileHandler.setFilter(new MyFilter());
	            logger.addHandler(fileHandler);
	            
	            for(int i=0; i<50; i++){
	                //messaggio
	                logger.log(Level.INFO, "Msg"+i);
	            }
	            logger.log(Level.CONFIG, "Config");
	        } catch (SecurityException | IOException e) {
	            e.printStackTrace();
	        }
	    }

}
