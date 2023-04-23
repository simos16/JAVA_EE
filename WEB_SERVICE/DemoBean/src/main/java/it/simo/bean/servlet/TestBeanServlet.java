package it.simo.bean.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import it.simo.bean.test.TestBeanLocal;

/**
 * Servlet implementation class TestBeanServlet
 */
public class TestBeanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	TestBeanLocal local;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestBeanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String salve = local.saluto();
		local.messaggioLocale();
		
		PrintWriter output = response.getWriter();
		output.println(salve);
		
	}

	

}
