package it.simo.filter.auth;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class Authenticate
 */
@WebFilter("/controller")
public class Authenticate extends HttpFilter implements Filter {
       
  

	private static final long serialVersionUID = 1L;

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
        
	    String password = request.getParameter("password");  
	   
	    if(password.equals("admin")){  
	    	RequestDispatcher rd = request.getRequestDispatcher("admin");  
	 	    rd.include(request, response);
	 	    
	    }  
	    if(password.equals("user")){  
	    	 RequestDispatcher rd = request.getRequestDispatcher("user");  
	 	     rd.include(request, response);
		    chain.doFilter(request, response);//sends request to next resource  
		    }
	    else{  
	    out.print("errore di password");  
	    RequestDispatcher rd = request.getRequestDispatcher("index.html");  
	    rd.include(request, response);  
	}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
