package it.simo.j4.basic;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LogTest {
	private static final Logger logger = LogManager.getLogger(LogTest.class);  
	
	public static void main(String[] args) {
		
		logger.debug("Messaggio di debug");
		logger.info("Messaggio informativo");
		logger.warn("warn");
		
		
		logger.debug("{}", () -> leggiNum());

	}
	
	static int leggiNum() {
        return 10;
    }
}
