package it.simo.session.hidden;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(urlPatterns="/hidden1")
public class Hidden1 extends HttpServlet {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String utente =request.getParameter("nome");
		out.print("Hey " + utente);
		
		//CREARE IL CAMPO NASCOSTO
		out.print("<form action='hidden2'>");
		out.print("<input type='hidden' name='nome' value='" + utente + "'>");
		out.print("<input type='submit' value='vai'>");
		out.print("</form>");
		
		out.close();

                }catch(Exception e){System.out.println(e);}
	}

}
