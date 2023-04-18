package it.simo.jsp.bean;

import java.io.Serializable;

public class ProdottoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String descrizione;
	private float prezzo;

	
	public ProdottoBean() {}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public float getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	
}


