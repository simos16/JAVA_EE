package it.simo.thread.sincro;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ThreadSincro
 */
@WebServlet(urlPatterns="/saldo")
public class ThreadSincro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int saldo = 20;
       
	/**
	 *  
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	response.setContentType("text/html");
    	PrintWriter out = response.getWriter();
		out.print("<h1>Saldo corrente: " + saldo + "</h1>");
		out.print("<form action = 'saldo' method=\"POST\">");
		out.print("<input type=\"submit\" value=\"-10\">");
		out.print("</form>");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		
		synchronized(this){
			
			if(saldo  > 10){			
				try {
					Thread.sleep(10*1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				saldo -= 10;
			}
		}

		response.sendRedirect("/ServletThread/saldo");
	}



}
