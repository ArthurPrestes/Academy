package br.com.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;


@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer aluno;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "curso") 
	private Curso curso;
	
	@Column(name = "matricula")
	private String matricula;
	
	@Column(name = "status")
	private Status status;
	
	private String turno;

	public Integer getAluno() {
		return aluno;
	}

	public void setAluno(Integer aluno) {
		this.aluno = aluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
