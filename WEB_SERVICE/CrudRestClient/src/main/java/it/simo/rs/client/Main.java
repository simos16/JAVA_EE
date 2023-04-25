package it.simo.rs.client;

import jakarta.ws.rs.client.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class Main {
	private static String baseURI = "http://localhost:8080/CrudRest/products/";

	public static void main(String[] args) {
		//testList();
		//testGet();
		//testAdd();
		//testUpdate();
		//testDelete();
		//testList();
		
	}

	private static void testDelete() {
		WebTarget target = getWebTarget();
		String productId = "5";
		Response response = target.path(productId).request()
				.delete(Response.class);
		System.out.println(response);		
	}

	private static void testUpdate() {
		WebTarget target = getWebTarget();
		Product product = new Product("costumi", 100f);
		String productId = "3";
		Response response = target.path(productId).request()
				.put(Entity.entity(product, MediaType.APPLICATION_JSON), Response.class);
		System.out.println(response);		
	}

	static WebTarget getWebTarget() {
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		
		return client.target(baseURI);		
	}
	
	static void testList() {
		WebTarget target = getWebTarget();
		
		String response = target.request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		System.out.println(response);		
	}

	static void testGet() {
		WebTarget target = getWebTarget();
		String productId = "3";
		Product product = target.path(productId)
							.request().accept(MediaType.APPLICATION_JSON)
							.get(Product.class);
		
		System.out.println(product);		
	}
	
	static void testAdd() {
		WebTarget target = getWebTarget();
		Product product = new Product("sandali", 76.87f);
		Response response = target.request()
				.post(Entity.entity(product, MediaType.APPLICATION_JSON), Response.class);
		
		System.out.println(response.getLocation().toString());

	}

}
