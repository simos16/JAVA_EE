package it.simo.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="conto_corrente")
public class ContoCorrente {
	private Long id;
	private String numero;
	
	private Utente utenteConto;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_conto")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name="numero_conto")
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_utente")
	public Utente getUtenteConto() {
		return utenteConto;
	}
	public void setUtenteConto(Utente utente) {
		this.utenteConto = utente;
	}
}
