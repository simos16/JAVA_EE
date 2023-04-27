package it.simo.log.logmanager;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MyFmt extends Formatter{
	
	
	public String format(LogRecord record) {
        return record.getSourceClassName()+"="
                +record.getSourceMethodName()+"="
                +new Date(record.getMillis())+"="
                +record.getMessage()+"\n";
    }

}
