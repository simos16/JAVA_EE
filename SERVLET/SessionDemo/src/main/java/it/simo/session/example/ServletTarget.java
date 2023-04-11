package it.simo.session.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletTarget
 */
@WebServlet(urlPatterns="/pagina2")
public class ServletTarget extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Cookie[] cookies = request.getCookies();
			for (int i = 0; i < cookies.length; i++) {
				System.out.println("COOKIE nome " + cookies[i].getName());
				System.out.println("COOKIE valore " + cookies[i].getValue());
			}
		
		
				//GESTIRE SESSIONI
				HttpSession session = request.getSession();
				
				String utente = (String) session.getAttribute("utente");
				
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.print("<h1>Il nome utente è:" + utente + "</h1>");
	}

}
