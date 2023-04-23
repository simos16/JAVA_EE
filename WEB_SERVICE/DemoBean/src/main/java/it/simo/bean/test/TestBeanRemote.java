package it.simo.bean.test;

import jakarta.ejb.Remote;

@Remote
public interface TestBeanRemote extends Test {
	 //public String saluto();
	
	public void messaggioRemote();
	public void onlyRemote();
}
