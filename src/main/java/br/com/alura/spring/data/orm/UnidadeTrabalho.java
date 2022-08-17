package br.com.alura.spring.data.orm;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//@Entity
@Table(name = "unidade_trabalho")
public class UnidadeTrabalho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	
//	@ManyToMany(mappedBy = "unidadesTrabalho")
//	private List<Funcionario> funcionario;
	
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
	public UnidadeTrabalho() {
		// TODO Auto-generated constructor stub
	}
	public UnidadeTrabalho(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao=descricao;
	}
	
	
	
}
