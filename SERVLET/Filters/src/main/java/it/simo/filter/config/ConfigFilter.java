package it.simo.filter.config;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class ConfigFilter
 */
public class ConfigFilter extends HttpFilter implements Filter {
	FilterConfig config;   
       
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig config) throws ServletException {
		 this.config=config;  
	}
	

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();  
        
	    String s=config.getInitParameter("pagina-rossa");  
	          
	    if(s.equals("yes")){  
	    	 out.print("<body style='background-color:#f00;'>");  
	         out.print("<h1>Questa pagina è in costruzione</h1>"); 
	         out.print("</body>");  
	    }  
	    else{  
	         chain.doFilter(request, response);
	    }  
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
