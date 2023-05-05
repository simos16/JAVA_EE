package it.simo.project.controller;


import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import it.simo.project.model.Persona;
import it.simo.project.model.Fattura;
import it.simo.project.model.Utente;
import it.simo.project.model.ContoCorrente;


/**
 * Session Bean implementation class PersonaServiceBean
 */
@Stateless
public class PersonaServiceBean implements PersonaServiceBeanRemote, PersonaServiceBeanLocal {
	@PersistenceContext(unitName="corsoWebPersistence")
	
    EntityManager manager;
    /**
     * Default constructor. 
     */
    public PersonaServiceBean() {
        // TODO Auto-generated constructor stub
    }
    
    	public void inserisci(Persona p) {
    				manager.persist(p);      
    			
    	}
    
    public void aggiorna(Persona p) {
    	manager.merge(p);
    	
    }
    	

    public void cancella(Persona p) {
    	manager.remove(p);
    	
    }

    public Persona getPersonaById(Long id) {
    	return manager.find(Persona.class, id);
    }
    
    @SuppressWarnings("unchecked")
	public List<Persona> getAllPerson() {
		Query q = manager.createQuery("SELECT p FROM Persona p");
		return q.getResultList();
	}
    @Override
    public void salvaFattura(Fattura f) {
    	manager.persist(f);
    }

	@Override
	public Fattura stampaFattura(Long id) {
		 return manager.find(Fattura.class, id); 	
	}

	@Override
	public void creaConto() {
		Utente user = new Utente();
		user.setNome("Gianni");
		user.setCognome("Volpi");
		
		ContoCorrente conto1 = new ContoCorrente();
    	conto1.setNumero("234");
    	conto1.setUtenteConto(user);
    	manager.persist(conto1);
		
		/*Utente user = new Utente();
		user.setNome("Federica");
		user.setCognome("Censi");
		user.setConti(new ArrayList<ContoCorrente>());
    	manager.persist(user);
    	
    	ContoCorrente conto1 = new ContoCorrente();
    	conto1.setNumero("789");
    	conto1.setUtenteConto(user);
    	user.getConti().add(conto1);
    	
    	manager.persist(conto1);
    	
    	ContoCorrente conto2 = new ContoCorrente();
    	conto2.setNumero("675");
    	conto2.setUtenteConto(user);
    	user.getConti().add(conto2);
    	
    	manager.persist(conto2);*/
		
	}

	@Override
	public void creaContoUtente() {
		Utente userEsistente = manager.find(Utente.class, 5l);
		
		ContoCorrente conto1 = new ContoCorrente();
    	conto1.setNumero("908");
    	conto1.setUtenteConto(userEsistente);
    	manager.persist(conto1);
		
		
		
	}

	
    
   
    

}
