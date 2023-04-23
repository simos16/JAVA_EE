package it.simo.bean.test;

import jakarta.ejb.Stateless;

/**
 * Session Bean implementation class TestBean
 */

@Stateless
public class TestBean implements TestBeanLocal, TestBeanRemote {

    /**
     * Default constructor. 
     */
    public TestBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String saluto() {
		// TODO Auto-generated method stub
		return "Ciao sono un EJB!";
	}

	@Override
	public void messaggioRemote() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void messaggioLocale() {
		// TODO Auto-generated method stub
		System.out.println("Sono la bean local");
		
	}

	@Override
	public void onlyRemote() {
		// TODO Auto-generated method stub
		
	}
    
	
   

}
