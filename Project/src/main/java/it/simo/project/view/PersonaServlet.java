package it.simo.project.view;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import it.simo.project.controller.PersonaServiceBeanLocal;
import it.simo.project.model.Persona;
import it.simo.project.model.Fattura;
import it.simo.project.model.Indirizzo;

/**
 * Servlet implementation class PersonaServlet
 */
@WebServlet("/persona")
public class PersonaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	PersonaServiceBeanLocal personaService;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String method = request.getParameter("method") != null ? request.getParameter("method") : "";
		
		if(method.equals("add")) {
			Persona p = new Persona();
			p.setNome("Giovanni");
			p.setCognome("Bianchi");
			p.setAnni(90);
			
			Indirizzo indirizzo = new Indirizzo();
			indirizzo.setVia("tal dei tali");
			indirizzo.setCitta("Amburgo");
			
			p.setIndirizzo(indirizzo);
			
			personaService.inserisci(p);
			
			}if(method.equals("get")) { 
			Long id = Long.parseLong(request.getParameter("id"));	
			Persona p = personaService.getPersonaById(id);	
			response.getWriter().println(p.getId()+ " " + p.getCognome() + " " + p.getNome());
			}if(method.equals("fattura")) {
				Fattura f = new Fattura();
				f.setNome("Piera");
				f.setCognome("Massimi");
		    	f.setDataFattura(new Date());
		    	f.setNumeroFattura("56");
				personaService.salvaFattura(f);	
				}if(method.equals("getFattura")){
					Long id = Long.parseLong(request.getParameter("id"));
					Fattura fattura = personaService.stampaFattura(id);	
					response.getWriter().println(fattura.getId() + " " +fattura.getCognome() + " " + fattura.getNome() + " " 
					+ fattura.getDataFattura());
					
				}
			
			else {
		
			}
		
		
			List<Persona> listP = new ArrayList<>();
			listP = personaService.getAllPerson();
			
			//request.setAttribute("people", listP);
			//request.getRequestDispatcher("index.jsp").forward(request, response);
			
			PrintWriter out = response.getWriter();
			
			for (Persona pr : listP) {
	            System.out.println(pr);
	            out.println(pr);
	        }
			
			//personaService.creaConto();
			personaService.creaContoUtente();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
