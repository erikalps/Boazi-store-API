package com.baozi.boazi_story.model;
import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity 
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	private BigDecimal preco;
	private Boolean estoque;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(Long id ) {
		this.id = id;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome ) {
		this.nome = nome;
	}
	
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	public boolean getEstoque() {
		return estoque;
	}
	
	
	public void setEstoque(boolean estoque) {
		this.estoque = estoque; 
	}
	
	
	
}
