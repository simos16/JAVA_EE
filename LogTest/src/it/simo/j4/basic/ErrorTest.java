package it.simo.j4.basic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ErrorTest {
	private static final Logger logger = LogManager.getLogger(ErrorTest.class);

	public static void main(String[] args) {

        try {
            System.out.println(getData());
        } catch (IllegalArgumentException e) {
            logger.error("{}", e);
        }

    }

    static int getData() throws IllegalArgumentException {
        throw new IllegalArgumentException("Ops...hai scatenato un IllegalArgumentException!");
    }

	}

