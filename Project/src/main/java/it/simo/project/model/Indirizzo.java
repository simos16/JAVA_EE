package it.simo.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="indirizzo")
public class Indirizzo {
	private Long id;
	private String via;
	private String citta;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_indirizzo")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="via")
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	@Column(name="citta")
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	@Override
	public String toString() {
		return "Dettagli indirizzo: [Id=" + id + ", via=" + via + ", città=" + citta
				+  "]";
	}
	
}
