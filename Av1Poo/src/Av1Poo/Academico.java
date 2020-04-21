package Av1Poo;

import java.util.Date;
import java.util.Scanner;

public class Academico extends PessoaFisica implements Login{
	
	private int matricula; // MATRICULA DO ALUNO
	private boolean ativo; // SE ALUNO ESTA ATIVO OU NAO
	private int senha; //SENHA PARA LOGIN DO GIOCONDA
	private int login;//MATRICULA CADASTRADA PARA LOGIN NO GIOCONDA
	private String curso; // CURSO QUE ALUNO ESTA MATRICULADO 
	private Date dataMatricula; // DATA QUE FEZ SUA MATRICULA
	private String turma; 	// TURMA DO CURSO MATRICULADO
	private String modalidadeEnsino; // EAD OU PRESENCIAL
	
	//Metodo Construtor
	
		public Academico(String cpf, String rg, int matricula, String curso, Date dataMatricula, String turma,
			String modalidadeEnsino) {
		super(cpf, rg);
		this.matricula = 0;
		this.senha = 0;
		this.login = 0;
		this.curso = "";
		this.dataMatricula = dataMatricula;
		this.turma = "";
		this.modalidadeEnsino = "";
		this.ativo = false;
	}

	// METODOS ACESSORES GET / SET
	
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
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	
	//METODOS PRINCIPAIS
	
	public  String getInformacaoDados()  {
		String informacao = super.getInformacaoDados();
		return 	informacao + 
				"\n Numero Matricula: " + this.getMatricula() +
				"\n Turma: " + this.getTurma() +
				"\n Modalidade Ensino: " + this.getModalidadeEnsino() +
				"\n DataMatricula: " + this.getDataMatricula();
		
	}
	// METODOS SOBREPOSIÇAO DA INTERFACE LOGIN
	
	@Override
	public void criarLogin() { // METODO PARA CRIAR UM LOGIN E SENHA DO ALUNO
		
		 Scanner teclado = new Scanner(System.in); // PARA O USUARIO INSERIR O DADO
		 if (ativo == true) { // VERIFICA SE ALUNO ESTA ATIVO OU NAO
			int continuar = 1; // VARIAVEL PARA CASO DE ALGO ERRADO POSSA CONTINUAR OU ENCERRAR
			do { // INICIO DO WHILE 
					
			System.out.println("Insira sua Matricula");
			int m = teclado.nextInt(); // VARIAVEL DE COMPARAÇAO DA MATRICULA 
			
			if (  m == getMatricula() ) { // INICIO DO IF DE COMPARAÇAO DA MATRICULA
				int[] cadastraSenha = new int[2]; // ARRAY PARA COMPARAR AS SENHAS DIGITADAS
				
				System.out.println("insira sua senha de 6 numeros"); 
				 cadastraSenha[0] = teclado.nextInt(); // RECEBE A PRIMRIRA SENHA
				 
				 System.out.println("insira novamente");
				 cadastraSenha[1] = teclado.nextInt();	 // RECEBE A SEGUNDA SENHA
				
				if(cadastraSenha[0] == cadastraSenha[1]) { // INICIO DO IF PARA COMPARAÇAO DAS SENHAS DIGITADAS [0,1]
					  login = matricula; // RECEBE O VALOR PARA CADASTRAR O LOGIN NO GIOCONDA
					  senha = cadastraSenha[1] ; // RECEBE O VALOR DA SENHA USADA PARA LOGIN NO GIOCONDA
					  
					 System.out.println("senha cadastrada "); // MENSAGEM QUE A SENHA ESTA CADASTRADA
					 continuar = 0; // RECEBE O VALOR DE 0 PARA SAIR DO WHILE 
				 }else { // INFORMA QUE AS SENHAS [0,1] NAO SAO IGUAIS
					 System.out.println("senhas nao conferem");
					 System.out.println("Tentar Novamente? ");
					 System.out.println("1 para Sim ou 0 para nao"); // MENSAGEM PAARA VOLTAR PARA O WHILE OU NAOo
						continuar = teclado.nextInt(); // RECEBE O VALOR DIGITADO PARA TENTAR NOVAMENTE OU NAO
				 } // FIM DO ELSE
			} else { // ELSE DE COMPARAÇAO DA MATRUCULA SE FOI ENCONTRADA OU NAO
				System.out.printf("matricula nao encontrada \n\n");
				System.out.println("Tentar Novamente? ");
				System.out.println("1 para Sim ou 0 para nao"); // MENSAGEM PARA VOLTAR PAAR O DO WHILE OU NAO
				continuar = teclado.nextInt(); // RECEBE O VALOR DIGITADO PARA TENTAR NOVAMENTO OU NAO
			} // FIM DO ELSE
			
			}while (continuar != 0 ); // FIM DO WHILE // FAZ A COMPARAÇAO DO WHILE // 
		 } else { // SE ALUNO ESTIVER INATIVO 
			 System.out.println("Voce nao tem permissao");
				
			}// FIM DO ELSE DE VERIFICAÇAO ATIVO 
		System.out.println("the end");// INDICA QUE O PROGRAMA CHEGOU AO FIM
	} // FIM DO METODO CRIAR LOGIN

	@Override
	public void fazerLogin() { // INICIO DO METODO FAZER LOGIN IMPLEMENTADA DA INTERFACE
		 Scanner teclado = new Scanner(System.in); // PARA O USUARIO INSERIR O DADO
		 int continuar = 1; // VARIAVEL PARA COMPARAÇAO DO DO WHILE

				while(continuar  == 1) { // INICIO DO WHILE PARA VERIFICAR SE USUARIO QUER CONTINUAR OU NAO CASO DER ERRO 
				System.out.println(" Login ");
				matricula = teclado.nextInt();// RECEBE A MATRICULA DO USUARIO
				
				
				System.out.println("Senha ");
				int s = teclado.nextInt(); // RECEBE A VARIAVEL PARA COMPARAÇAO DA SENHA
				
				if(getMatricula() == getLogin() && getSenha() == s) { // INICIO DO IF DE COMPARAÇAO SE LOGIN E SENHA SAO VALIDOS
					System.out.println("Bem vindo ao GIOCONDA"); // MENSAGEM DE SAUDAÇAO DO GIOCONDA 
					continuar = 0; // VARIAVEL PARA SAIR DO WHILE 
				} else { // ELSE DE COMPARAÇAO QUE LOGIN E SENHA NAO CONFEREM
					System.out.println("Tente novamente"); 
					System.out.println("1 para Sim ou 0 para nao"); // MENSAGEM PARA VOLTAR PARA O WHILE OU NAO
					continuar = teclado.nextInt(); // RECEBE O VALOR PARA CONTINUAR OU NAO
				 }// FIM DO ELSE
				} // FIM DO WHILE DE CONTINUAR OU NAO 
 
			System.out.println("the end \n"); // MENSAGEM DE ENCERRAMENTO DO PROGRAMA
		} // FIM DO METODO FAZER LOGIN
		
		
		
	@Override
	public void criarSenha() {
		// TODO Auto-generated method stub
		
	}

}
