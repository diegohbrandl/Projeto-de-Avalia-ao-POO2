package Av1Poo;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date dataNascimento; 
	private String estadoCivil;
	
	// Metodos Acessores 
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
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	// Metodos Principais
	

	
	public  String getInformacaoDados()  {
		return  " Nome: " + this.getNome() +
				"\n Data Nascimento: " + this.dataNascimento +
				"\n Estado Civil: " + this.getEstadoCivil();
	}
	

}
