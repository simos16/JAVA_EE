package org.tempuri;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WSServlet
 */
@WebServlet("/test")
public class WSServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CalculatorSoapProxy c = new CalculatorSoapProxy();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WSServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//int nome = c.divide(20,5);
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int val1 = Integer.parseInt(num1);  
		int val2 = Integer.parseInt(num2);  
		int res = c.divide(val1,val2);
		out.print(res);
		
	}

}
