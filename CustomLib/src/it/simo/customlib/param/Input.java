package it.simo.customlib.param;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Input extends TagSupport{
	private static final long serialVersionUID = 1L;
	private String inputName;
	private String inputValue;
	

	@Override
	public int doEndTag() throws JspException {
		
String testo = "<input type=\"text\" name=\""+getInputName()+"\" value=\""+getInputValue()+"\" class=\"mycss\" />";
		
		try {			
			JspWriter writer = pageContext.getOut();
			writer.println(testo);
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		return super.doEndTag();
	}

	public String getInputName() {
		return inputName;
	}


	public void setInputName(String inputName) {
		this.inputName = inputName;
	}


	public String getInputValue() {
		return inputValue;
	}


	public void setInputValue(String inputValue) {
		this.inputValue = inputValue;
	}
	
	
}
