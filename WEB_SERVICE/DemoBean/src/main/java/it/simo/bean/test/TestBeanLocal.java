package it.simo.bean.test;

import jakarta.ejb.Local;

@Local
public interface TestBeanLocal extends Test {
	
	 //public String saluto();
	
	
	public void messaggioLocale();

}
