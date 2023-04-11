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
 * Servlet implementation class ReservedServlet
 */
@WebServlet(urlPatterns="/profilo")
public class ReservedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		HttpSession session=request.getSession(false);
		if(session!=null){
		String name=(String)session.getAttribute("name");
		
		out.print("Ciao, "+name+" Sei nella tua area riservata");
		}
		else{
			out.print("Ehi, furbetto! Ti piacerebbe entrare senza login, vero?");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}

	

}
