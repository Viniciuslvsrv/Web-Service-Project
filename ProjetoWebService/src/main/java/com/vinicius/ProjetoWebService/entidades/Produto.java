package com.vinicius.ProjetoWebService.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String descriçao;
	private Double preço;
	private String imgUrl;

	@ManyToMany
	@JoinTable(name = "produto_categoria", joinColumns = @JoinColumn(name = "produtoId"), inverseJoinColumns = @JoinColumn(name = "categoriaId"))
	private Set<Categoria> categorias = new HashSet<>();

	@OneToMany(mappedBy = "id.produto")
	private Set<PedidoItem> itens = new HashSet<>();

	public Produto() {

	}

	public Produto(Long id, String name, String descriçao, Double preço, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.descriçao = descriçao;
		this.preço = preço;
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Set<Categoria> getCategorias() {
		return categorias;
	}

	@JsonIgnore
	public Set<Pedido> getPedidos() {
		Set<Pedido> set = new HashSet<>();
		for(PedidoItem pi : itens) {
			set.add(pi.getPedido());
		}
		
		return set;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}

}
