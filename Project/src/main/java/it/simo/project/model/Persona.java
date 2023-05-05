package it.simo.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="persona")
public class Persona {
	private Long id;
	private String nome;
	private String cognome;
	private int anni;
	
	private Indirizzo  indirizzo;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_indirizzo")
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	@Id
	@Column(name="id_persona")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="nome", nullable=false, length=100)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="cognome")
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Column(name="anni")
	public int getAnni() {
		return anni;
	}
	public void setAnni(int anni) {
		this.anni = anni;
	}
	
	@Override
	public String toString() {
		return "Dettagli utenti: [Id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+ ", anni=" + anni  + "]";
	}
}
