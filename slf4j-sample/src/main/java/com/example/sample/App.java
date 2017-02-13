package com.example.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger slf4jLogger = LoggerFactory.getLogger(App.class); 
	
    public static void main( String[] args )
    {  	    
    	slf4jLogger.trace("This is a TRACE message.");    	
    	slf4jLogger.debug("This is a DEBUG message.");
    	slf4jLogger.info("This is an INFO message.");    
    	slf4jLogger.warn("This is a WARN message.");    
    	slf4jLogger.error("This is an ERROR message.");
    }
}
