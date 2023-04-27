package it.simo.log.logmanager;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class MyHnd extends StreamHandler {
	@Override
    public void publish(LogRecord record) {
       
        super.publish(record);
    }


    @Override
    public void flush() {
        super.flush();
    }


    @Override
    public void close() throws SecurityException {
        super.close();
    }
}
