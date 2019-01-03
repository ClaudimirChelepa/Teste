package com.crud.entidades;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
public class Cidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String Nome;
	private String Estado;
	
	public Cidade() {
		
	}
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	@Column(name = "nome", nullable = false)
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	@Column(name = "estado", nullable = false)
	public String getEstado() {
		return Estado;
	}
	
	public void setEstado(String Estado) {
		this.Estado = Estado;
	}

}
