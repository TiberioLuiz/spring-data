package br.com.alura.spring.data.orm;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Date dataNascimento;
	private LocalDate dataContrato;
	@OneToMany
	private Cargo cargo ;
	
	
	
	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataContrato() {
		return dataContrato;
	}
	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
