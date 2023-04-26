package org.tempuri;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		CalculatorSoapProxy c = new CalculatorSoapProxy();
		
		int res = c.divide(10,5);
		System.out.print(res);

	}

}
