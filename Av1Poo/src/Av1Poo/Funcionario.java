package Av1Poo;

import java.util.Date;

public abstract class Funcionario extends PessoaFisica{
	
	private String cargo;
	private double salario;
	private Date dataAdmissao;
	private String carteiraTrabalho;
	private boolean ativo;
	// METODO CONSTRUTOR
	
		public Funcionario(String cpf, String rg) {
			super(cpf, rg);	
		}
		
	//	METODOS ACESSORES GET / SET
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	// METODO PRINCIPAIS
	public  String getInformacaoDados()  {
		String informacao = super.getInformacaoDados(); 
		return informacao + 
				"\n Cargo -->>>>> " + this.getCargo() +
				"\n Salario -->>>>> " + this.getSalario()+
				"\n Data de Admissao -->>>>>> " + this.getDataAdmissao() +
				"\n carteira de Trabalho -->>>>>> " + this.getCarteiraTrabalho()+
				"\n Funcionario Ativo -->>>>>> " + this.isAtivo();
		
	}
}
