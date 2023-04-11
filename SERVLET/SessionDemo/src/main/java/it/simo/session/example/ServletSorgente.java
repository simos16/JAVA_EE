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
 * Servlet implementation class ServletSorgente
 */
@WebServlet(urlPatterns="/pagina1")
public class ServletSorgente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Aggiungiamo un altro cookie
		response.addCookie(new Cookie("securityToken", "12345"));
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				System.out.println(cookies[i].getName());
				System.out.println(cookies[i].getValue());
			}
		}
		
		
		//GESTIRE SESSIONI
				String nome = request.getParameter("nome");
				
				//CREO LA SESSIONE - QUI VIENE IMPOSTATA
				HttpSession session = request.getSession();
				session.setAttribute("utente", nome);
				
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				//out.print("<a href='pagina2'>Clicca anche qui</a>");
				
				
				//rinominare URL
				String url = "pagina2?sessionId=789";
				out.print("<a href='" + url + "'>Puoi cliccare anche qui</a>");
	}

}
