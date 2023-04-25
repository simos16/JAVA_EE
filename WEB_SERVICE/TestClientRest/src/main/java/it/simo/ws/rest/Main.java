package it.simo.ws.rest;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

public class Main {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/TestMaven/api/json";
        
		ClientConfig config = new ClientConfig();
       
		Client client = ClientBuilder.newClient(config);
        
		WebTarget target = client.target(uri);
         
        String response = target.request()
                    .accept(MediaType.APPLICATION_JSON)
                    .get(String.class);
         
        System.out.println(response);
	}

}
