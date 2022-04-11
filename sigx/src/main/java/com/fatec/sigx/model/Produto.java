package com.fatec.sigx.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produto {
	@Id
	String codigoProduto;
	int quantidadeNoEstoque; 
	String descricao;
	
	public Produto(String codigoProduto, int quantidadeNoEstoque, String descricao) {
		super();
		this.codigoProduto = codigoProduto;
		this.quantidadeNoEstoque = quantidadeNoEstoque;
		this.descricao = descricao;
	}
	
	public Produto() {
		
	}
	
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public int getQuantidadeNoEstoque() {
		return quantidadeNoEstoque;
	}
	public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
		this.quantidadeNoEstoque = quantidadeNoEstoque;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescrição(String descricao) {
		this.descricao = descricao;
	}

}
