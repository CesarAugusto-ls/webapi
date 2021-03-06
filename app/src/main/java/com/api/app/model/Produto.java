package com.api.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table
@NamedQuery(name="Produto.findAll", query="select p from Produto p")
@TableGenerator(name="Produto", initialValue=1, allocationSize=1)
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="hibernate_sequence") 
	private Long idProduto;
	private String nome;
	
	public Long getIdPessoa() {
		return idProduto;
	}
	public void setIdPessoa(Long idPessoa) {
		this.idProduto = idPessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
