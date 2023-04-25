package it.simo.ws.rest;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path(value="/api")
public class RestTest  {
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path(value="/hello")
	public String hello() {
        return "Hello dalla mia prima rest text plain edition";
    }
	

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path(value="/metodo")
	public String metodo1() {
        return "Hello World dalla seconda rest text plain edition";
    }

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/param/{nome}")
	public String test(@PathParam("nome") String nome) {
		return "Ciao " + nome.toUpperCase();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/json")
	public String helloJson() {
	    return "{\"nome\":\"pippo\", \"messaggio\":\"Hello\"}";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("/html")
	public String helloHtml() {
	    return "<h1>Saluto in html</h1>";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("/xml")
	public String helloXml() {
	    return "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
	    		+ "	<Libri>\n"
	    		+ "	    <book>Libro 1</book>\n"
	    		+ "	    <autore>Autore 1</autore>\n"
	    		+ "	</Libri>";
	}	
	
}
