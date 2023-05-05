package it.simo.project.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="fattura")
@SecondaryTable(name="cliente", pkJoinColumns={@PrimaryKeyJoinColumn(name="id_cliente")})
public class Fattura {

	private Long id;
	private String numeroFattura;
	private Date dataFattura;
	
	//private Persona persona;
	private String nome;
	private String cognome;
	
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_fattura")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name="numero")
	public String getNumeroFattura() {
		return numeroFattura;
	}
	public void setNumeroFattura(String numeroFattura) {
		this.numeroFattura = numeroFattura;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="data_fattura")
	public Date getDataFattura() {
		return dataFattura;
	}
	public void setDataFattura(Date dataFattura) {
		this.dataFattura = dataFattura;
	}
	
	@Column(name="nome", table="cliente")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Column(name="cognome", table="cliente")
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Override
	public String toString() {
		return "Dettagli fattura: [Id=" + id + ", nome=" + nome + ", cognome=" + cognome
				+  "]";
	}
}
