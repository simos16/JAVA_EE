package it.simo.testweb.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Second
 */

public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Second() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		 
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("<!DOCTYPE html>");
	     out.println("<html>");
	     out.println("<head><title>Home</title></head>");
	     out.println("<body>");
	     out.println("<h1>Second Servlet</h1>");
	     out.println("<h2>Ciao " + nome + " " + cognome + "</h2>");
	     out.println("</body>");
	     out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 out.println("<!DOCTYPE html>");
	     out.println("<html>");
	     out.println("<head><title>Home</title></head>");
	     out.println("<body>");
	     out.println("<h1>Second Servlet</h1>");
	     out.println("<h2>Ciao " + nome + " " + cognome + "</h2>");
	     out.println("</body>");
	     out.print("</html>");
		
	}

}
