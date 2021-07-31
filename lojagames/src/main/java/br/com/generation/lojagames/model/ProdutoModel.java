package br.com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "O atributo Descrição deve ser obrigatorio")
	private String descricao;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;

	}

	public CategoriaModel getProduto() {
		return produto;
	}

	public void setProduto(CategoriaModel produto) {
		this.produto = produto;
	}
}
