package it.simo.json.service;

import java.util.Arrays;
import java.util.List;

import it.simo.json.model.Utente;

public class UtenteService {
	
	public List<Utente> getUtente(){
		
		return Arrays.asList(new Utente(23L, "Mario", "Rossi", "mario@mario.it"),
				new Utente(24L, "Carla", "Verdi", "carla@carla.it"),
				new Utente(25L, "Federica", "Bruni", "fede@fede.it"));
		
	}

}
