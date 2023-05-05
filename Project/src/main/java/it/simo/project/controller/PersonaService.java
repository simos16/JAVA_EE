package it.simo.project.controller;

import java.util.List;

import it.simo.project.model.Persona;
import it.simo.project.model.Fattura;

public interface PersonaService {
	
	public void inserisci(Persona p);
	public void aggiorna(Persona p);
    public void cancella(Persona p);  
	public Persona getPersonaById(Long id);
	public List<Persona> getAllPerson();

	public void salvaFattura(Fattura f);
	public Fattura stampaFattura(Long id);
	
	public void creaConto();
	
	public void creaContoUtente();
}
