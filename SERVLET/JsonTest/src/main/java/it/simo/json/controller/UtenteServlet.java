package it.simo.json.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.*;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.PrintWriter;

import it.simo.json.model.Utente;
import it.simo.json.service.UtenteService;

/**
 * Servlet implementation class UtenteServlet
 */
@WebServlet(urlPatterns="/utenti", name="UtenteServlet", description="simple servlet to return a json response")
public class UtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UtenteService service = new UtenteService();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UtenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		List<Utente> utenti = new ArrayList<>();
		utenti = service.getUtente();
		
		Gson gson = new Gson();
		String utenteJson = gson.toJson(utenti);
		PrintWriter out = response.getWriter();
		out.write(utenteJson);
		out.close();
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
