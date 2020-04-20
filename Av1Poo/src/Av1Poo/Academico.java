package Av1Poo;

import java.util.Date;
import java.util.Scanner;

public class Academico extends PessoaFisica implements Login{
	
	private int matricula;
	private int senha;
	private int login;
	private String curso;
	private Date dataMatricula;
	private String turma; 	
	private String modalidadeEnsino; // EAD ou Presencial
	
	//Metodo Construtor
	
		public Academico(String cpf, String rg, int matricula, String curso, Date dataMatricula, String turma,
			String modalidadeEnsino) {
		super(cpf, rg);
		this.matricula = 0;
		this.senha = 0;
		this.curso = "";
		this.dataMatricula = dataMatricula;
		this.turma = "";
		this.modalidadeEnsino = "";
	}

	// Metodos Acessores
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Date getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getModalidadeEnsino() {
		return modalidadeEnsino;
	}
	public void setModalidadeEnsino(String modalidadeEnsino) {
		this.modalidadeEnsino = modalidadeEnsino;
	}
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	
	//Metodos principais
	
	public  String getInformacaoDados()  {
		String informacao = super.getInformacaoDados();
		return 	informacao + 
				"\n Numero Matricula: " + this.getMatricula() +
				"\n Turma: " + this.getTurma() +
				"\n Modalidade Ensino: " + this.getModalidadeEnsino() +
				"\n DataMatricula: " + this.getDataMatricula();
		
	}
	// Metodos Sobreposiçao
	@Override
	public void criarLogin() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Insira sua Matricula");
		int matricula = teclado.nextInt();
		
		if ( getMatricula() == login) {
			int[] cadastraSenha = new int[2];
			
			System.out.println("insira sua senha de 6 numeros");
			 cadastraSenha[0] = teclado.nextInt();
			 
			 System.out.println("insira novamente");
			 cadastraSenha[1] = teclado.nextInt();	 
			
			if(cadastraSenha[0] == cadastraSenha[1]) {		
				 System.out.println("senha cadastrada ");
				  senha = cadastraSenha[1] ; 
			 }else {
				 System.out.println("senhas nao conferem");
			 }
		} else {
			System.out.println("matricula nao encontrada");
		}
		
	}

	@Override
	public void fazerLogin() {
		Scanner teclado = new Scanner(System.in);
		 do {
		
			System.out.println(" Login ");
			teclado.nextInt();
			matricula = compareTo(teclado.nextInt(matricula));
			
			System.out.println("Senha ");
			senha = compareTo(teclado.nextInt(senha));
			
			if(getMatricula() == getMatricula() && getSenha() == getSenha()) {
				System.out.println("Bem vindo ao GIOCONDA");
			} else {
				System.out.println("Tente novamente");
			}
		 }while ((getMatricula() != getMatricula() )&& (getSenha() != getSenha())); 
		}
		
		

	private int compareTo(int nextInt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void criarSenha() {
		// TODO Auto-generated method stub
		
	}

	
}
