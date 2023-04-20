package it.simo.customlib.param;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Parametro extends TagSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public int doEndTag() throws JspException {
		
		HttpServletRequest req = (HttpServletRequest)pageContext.getRequest();
		
		
		try {
			JspWriter writer = pageContext.getOut();
			if(req.getParameter("user") != null) {			
				writer.println("Ciao " + req.getParameter("user"));
			} else {
				writer.print("Ciao, clicca qui");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doEndTag();
	}
	
	
	
	

}
