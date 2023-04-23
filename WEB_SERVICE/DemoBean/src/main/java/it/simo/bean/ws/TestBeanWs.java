package it.simo.bean.ws;

import jakarta.ejb.Stateless;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@Stateless
@WebService(serviceName="bean")
public class TestBeanWs {
	
	@WebMethod(operationName="messaggio")
	public String serviceBean(String messaggio) {
		return "Ciao " + messaggio;
	}

}
