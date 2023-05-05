package it.simo.project.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="utente")
public class Utente {
	private Long id;
	private String nome;
	private String cognome;
	
	private List<ContoCorrente> conti;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_utente")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@OneToMany(mappedBy="utenteConto", cascade=CascadeType.ALL)
	public List<ContoCorrente> getConti() {
		return conti;
	}
	public void setConti(List<ContoCorrente> conti) {
		this.conti = conti;
	}
	
	@Override
	public String toString() {
		return "Dettagli utente: [Id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+  "]";
	}
}
