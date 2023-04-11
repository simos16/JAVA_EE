package it.simo.testweb.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class PrimaServlet
 */
@WebServlet("/Prima")
public class PrimaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("siamo nel metodo init: " + config.getServletName());
	}
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		azioni(request,response);
		response.getWriter().append("<br>");
		response.getWriter().append("Served at: ").append(request.getContextPath()).append(request.getServletPath() + "<br>");
		response.getWriter().append("Metodo: ").append(request.getMethod() + "<br>");
		response.getWriter().append("MIME: ").append(request.getContentType() + "<br>");
		//response.sendError(404, "Status errore 404");
		//response.sendRedirect("https://google.it");
		//response.sendRedirect("Second");
	
		
		System.out.println("Gestire get");
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>");
        out.print("<html><body><hr><br>");
        out.print("Impariamo ad usare la servlet che si chiama " + "<b>" + request.getServletPath() + "</b>");
        out.print("<br><a href='/TestWeb'>Vai alla home</a>");
        out.print("Content-Type " + response.getWriter().append(request.getContentType()));
        out.print("Context-path " + request.getContextPath());
        out.print("Browser da Header " + request.getHeader("User-Agent"));
        
        out.print("<hr>");
        Enumeration<String> listaHeader = request.getHeaderNames();
        
        while(listaHeader.hasMoreElements()) {
        	String riga = listaHeader.nextElement();
        	response.getWriter().append(request.getHeader(riga) + "<br>");
        	
        }
        
        /*out.print("<hr><h2>QUERY STRING</h2>");
        out.print("Query: " + request.getQueryString() + "<br>");
        
        out.print("Recupero valore/parametro: " + "<b>" + request.getParameter("nome") + "</b><br>");
        //out.print("Query con valori del parametro: " + "<b>" + request.getParameterValues("nome") + "</b>");
        String [] params = request.getParameterValues("nome");
        for(String param:params) {
        	response.getWriter().append("<b>Parametro nome:</b> " + param + "<br>");
        	
        }*/
        
        
        out.print("<hr><h2>INFO IP e URL</h2>");
        out.print("IP: " + "<b>" + request.getRemoteAddr() + "</b><br>");
        out.print("IP: " + "<b>" + request.getLocalAddr() + "</b><br>");
        out.print("URL: " + "<b>" + request.getRequestURL() + "</b><br>");
        out.print("URI: " + "<b>" + request.getRequestURI() + "</b><br>");
        out.print("Server: " + "<b>" + request.getServerName() + "</b><br>");
        out.print("</body></html>");
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void azioni(HttpServletRequest req, HttpServletResponse res) throws IOException  {
		System.out.println("azioni");
		res.getWriter().append("sono il metodo azioni");	
	}
	
	
}
