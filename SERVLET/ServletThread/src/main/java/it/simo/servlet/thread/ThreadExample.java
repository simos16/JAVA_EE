package it.simo.servlet.thread;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ThreadExample
 */
@WebServlet(urlPatterns = "/risultato")
public class ThreadExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int totale;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().println("<h1>Current total: " + totale + "</h1>");
		response.getOutputStream().println("<form action = 'risultato' method='POST'>");
		response.getOutputStream().println("<input type='submit' value='+10'>");
		response.getOutputStream().println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		for(int i = 0; i < 10; i++){
			totale++;

			// ciclo di 10 per 1 secondo = richiesta ogni 10 sec
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		response.sendRedirect("/ServletThread/risultato");
	}
	}


