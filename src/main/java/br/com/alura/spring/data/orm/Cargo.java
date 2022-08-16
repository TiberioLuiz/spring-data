package br.com.alura.spring.data.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargos")
public class Cargo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	private String descricao;
	public Cargo() {
		// TODO Auto-generated constructor stub
	}
	public Cargo(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao=descricao;
	}
	
	@Override
	public String toString() {
		return "Cargo [id=" + id + ", descricao=" + descricao + "]";
	}
	
	
}
