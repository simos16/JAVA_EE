package it.simo.session.hidden;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet(urlPatterns="/hidden2")
public class Hidden2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

 public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		String utente = request.getParameter("nome");
		out.print("Eccoti "+ utente);

		out.close();

                }catch(Exception e){System.out.println(e);}
	}
	

}
