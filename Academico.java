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
				"\n Academico Ativo -->>>>> " + this.isAtivo() +
				"\n Numero Matricula -->>>>> " + this.getMatricula() +
				"\n Turma -->>>>> " + this.getTurma() +
				"\n Modalidade Ensino -->>>>> " + this.getModalidadeEnsino() +
				"\n DataMatricula -->>>>> " + this.getDataMatricula();
		
	}
	// METODOS SOBREPOSIÇAO DA INTERFACE LOGIN
	
	@Override
	public void cadastraLogin() { // METODO PARA CRIAR UM LOGIN 
		
		 Scanner teclado = new Scanner(System.in); // PARA O USUARIO INSERIR O DADO
		 
			int continuar = 1; // VARIAVEL PARA CASO DE ALGO ERRADO POSSA CONTINUAR OU ENCERRAR
			do { // INICIO DO WHILE 
					
			System.out.println("Insira sua Matricula");
			
			int m = teclado.nextInt(); // VARIAVEL DE COMPARAÇAO DA MATRICULA 
			if (ativo == true) { // VERIFICA SE ALUNO ESTA ATIVO OU NAO
					if (  m == getMatricula() ) { // INICIO DO IF DE COMPARAÇAO DA MATRICULA
						System.out.printf(" \n Matricula Encontrada \n\n");
						 login = matricula ; // LOGIN RECEBE A MATRICULA PARA ACESSO AO GIOCONDA
						continuar = 0;
					} else { // ELSE DE COMPARAÇAO DA MATRUCULA SE FOI ENCONTRADA OU NAO
						System.out.printf("\n matricula nao encontrada \n ");
						System.out.printf(" Tentar Novamente? ");
						System.out.printf(" \n\n 1 para Sim ou 0 para nao \n"); // MENSAGEM PARA VOLTAR PAAR O DO WHILE OU NAO
						continuar = teclado.nextInt(); // RECEBE O VALOR DIGITADO PARA TENTAR NOVAMENTO OU NAO
							} // FIM DO ELSE
			} else { // SE ALUNO ESTIVER INATIVO 
				 System.out.println("Matricula " + this.getMatricula()+ " inativa  voce nao tem permissao ");
				 continuar = 0;
					
				}// FIM DO ELSE DE VERIFICAÇAO ATIVO
			}while (continuar != 0 ); // FIM DO WHILE // FAZ A COMPARAÇAO DO WHILE // 
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
					System.out.println("Login ou Senha invalidos Tente novamente"); 
					System.out.println("1 para Sim ou 0 para nao"); // MENSAGEM PARA VOLTAR PARA O WHILE OU NAO
					continuar = teclado.nextInt(); // RECEBE O VALOR PARA CONTINUAR OU NAO
				 }// FIM DO ELSE
				} // FIM DO WHILE DE CONTINUAR OU NAO 
 
			System.out.println("the end \n"); // MENSAGEM DE ENCERRAMENTO DO PROGRAMA
		} // FIM DO METODO FAZER LOGIN

		
	@Override
	public void cadastraSenha() { // INICIO METODO PARA CADASTRAR SENHA
		Scanner teclado = new Scanner(System.in);
		int continuar = 1; // VARIAVEL PARA COMPARAÇAO CASO USUARIO DIGITE ALGO ERRADO
		if((getMatricula() == getMatricula()) && (isAtivo()== true)) { // IF PARA VERIFICAR SE MATRICULA E VALIDA E ATIVA 
		do { // INICIO DO DO WHILE
			
		int[] cadastraSenha = new int [2];  // ARRAY PARA COMPARAR AS SENHAS
		System.out.println("Insira sua senha de 6 digitos");
		cadastraSenha[0] = teclado.nextInt(); // RECEBE A PRIMEIRA SENHA
		
		System.out.println("insira novamente");
		cadastraSenha[1] = teclado.nextInt(); // RECEBE A SEGUNDA SENHA
		
		if(cadastraSenha[0] == cadastraSenha[1]) { // IF DE COMPARAÇAO PARA VERIFICAR SE AS DUAS SENHAS SAO IGUAIS
			System.out.println("Senha cadastrada com sucesso");
			senha = cadastraSenha[1]; // SENHA RECEBE O VALOR CADASTRADO
			continuar= 0; // VARIAVEL RECEBE O VALOR PARA SAIR DO WHILE
		}else { // CASO AS SENHAS [1,2] NAO CONFEREM
			System.out.println("senhas nao conferem \n");
			System.out.println("Tentar Novamente? \n\n");
			System.out.println("1 para Sim ou 0 para nao"); // MENSAGEM PAARA VOLTAR PARA O WHILE OU NAO
			continuar = teclado.nextInt(); // RECEBE O VALOR DIGITADO PARA TENTAR NOVAMENTE OU NAO
		}
		}while (continuar != 0); // FIM DO WHILE
		}else { // CASO A MATRICULA SEJA INVALIDA OU INATIVA
			System.out.printf("Matricula invalida ou Matricula inativa!");
		}// FIM DO ELSE
	} // FIM DO METODO CADASTRA SENHA

	}
