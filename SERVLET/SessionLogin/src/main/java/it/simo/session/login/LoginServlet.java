package it.simo.session.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		


		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		if(password.equals("admin")){
		out.print("Buongiorno, "+name);
		
		HttpSession session=request.getSession();
		session.setAttribute("name",name);
		}
		else{
			out.print("Mi dispiace, ma la password non è corretta");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}

}
