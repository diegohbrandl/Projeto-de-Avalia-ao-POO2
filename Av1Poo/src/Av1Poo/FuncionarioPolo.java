package Av1Poo;


import java.util.Date;
import java.util.Scanner;

public class FuncionarioPolo extends Funcionario implements Login{
	
	private int horasTrabalho;
	private String poloAtuacao;
	private String turno;
	private int login;
	private int senha;
	private int matricula;
	
	//METODO CONSTRUTOR
	
	public FuncionarioPolo(String cargo, String salario, Date dataAdmissao) {
		super(cargo,salario);
		this.horasTrabalho = 0;
		this.poloAtuacao = "";
		this.turno = "";
	}
	
	//METODS PRINCIPAIS
	
	public  String getInformacaoDados()  {
		String informacao = super.getInformacaoDados(); 
		return informacao + 
				"\n Horas Trabalho -->>>>> " + this.getHorasTrabalho() +
				"\n Polo Atuaçao -->>>>> " + this.getHorasTrabalho() +
				"\n Turno -->>>>>> " + this.getTurno();
		
	}
	
	// METODOS ACESSORES GET / SET
	
	public int getHorasTrabalho() {
		return horasTrabalho;
	}

	public void setHorasTrabalho(int horasTrabalho) {
		this.horasTrabalho = horasTrabalho;
	}

	public String getPoloAtuacao() {
		return poloAtuacao;
	}

	public void setPoloAtuacao(String poloAtuacao) {
		this.poloAtuacao = poloAtuacao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	
	//METODOS SOBREPOSIÇAO
	
	@Override
	public void cadastraLogin() {
		Scanner teclado = new Scanner(System.in);
		int continuar = 1;
		do {
		System.out.printf(" Digite seu Cpf \n ");
		String c = teclado.nextLine();
			 if  (c.equals(getCpf()) && isAtivo() == true)  {
			  continuar = 0;
			  do {
				  continuar = 1;
			System.out.printf(" Insira a Matricula \n");
			int m = teclado.nextInt();
			
				if(m == matricula ) {
					System.out.printf("Matricula Cadastrada com Sucesso \n");
					login = matricula;
					continuar = 0;
				}else {
					System.out.printf("\nMatricula invalida \n Tentar Novamente: \n\n 1 para Sim ou 0 para Nao \n\n" );
					continuar = teclado.nextInt();
				}
			  }while(continuar != 0);
		  }else {
			  System.out.printf(" Cpf invalido \n Tentar Novamente? \n 1 para Sim ou 0 para Nao \n\n ");
			  continuar = teclado.nextInt();
		  }
		}while (continuar != 0);
		System.out.println("\n\n the end \n\n");
	}
		

	@Override
	public void cadastraSenha() {
		Scanner teclado = new Scanner(System.in);
		int continuar = 1; // VARIAVEL PARA COMPARAÇAO CASO USUARIO DIGITE ALGO ERRADO
		if((getLogin() == getLogin()) && getCpf() == getCpf() && (isAtivo()== true)) { // IF PARA VERIFICAR SE MATRICULA E VALIDA E ATIVA 
		do { // INICIO DO DO WHILE
			
		int[] cadastraSenha = new int [2];  // ARRAY PARA COMPARAR AS SENHAS
		System.out.println("Insira sua senha de 6 digitos");
		cadastraSenha[0] = teclado.nextInt(); // RECEBE A PRIMEIRA SENHA
		
		System.out.println("insira novamente");
		cadastraSenha[1] = teclado.nextInt(); // RECEBE A SEGUNDA SENHA
		
		if(cadastraSenha[0] == cadastraSenha[1]) { // IF DE COMPARAÇAO PARA VERIFICAR SE AS DUAS SENHAS SAO IGUAIS
			System.out.println("\n\nSenha cadastrada com sucesso \n\n");
			senha = cadastraSenha[1]; // SENHA RECEBE O VALOR CADASTRADO
			continuar= 0; // VARIAVEL RECEBE O VALOR PARA SAIR DO WHILE
		}else { // CASO AS SENHAS [1,2] NAO CONFEREM
			System.out.println("senhas nao conferem \n");
			System.out.println("Tentar Novamente? \n\n");
			System.out.println("1 para Sim ou 0 para nao"); // MENSAGEM PAARA VOLTAR PARA O WHILE OU NAO
			continuar = teclado.nextInt(); // RECEBE O VALOR DIGITADO PARA TENTAR NOVAMENTE OU NAO
		}
		}while (continuar != 0); // FIM DO WHILE
		}else { // CASO A MATRICULA SEJA INVALIDA OU INATIVA OU CPF INVALIDO
			System.out.printf("Matricula invalida ou Matricula inativa!");
		}// FIM DO ELSE
	} // FIM DO METODO CADASTRA SENHA
		
	

	@Override
	public void fazerLogin() {
		Scanner teclado = new Scanner(System.in); // PARA O USUARIO INSERIR O DADO
		 int continuar = 1; // VARIAVEL PARA COMPARAÇAO DO DO WHILE

				while(continuar  == 1) { // INICIO DO WHILE PARA VERIFICAR SE USUARIO QUER CONTINUAR OU NAO CASO DER ERRO 
				System.out.println(" Login ");
				matricula = teclado.nextInt();// RECEBE A MATRICULA DO USUARIO
				
				
				System.out.println("Senha ");
				int s = teclado.nextInt(); // RECEBE A VARIAVEL PARA COMPARAÇAO DA SENHA
				
				System.out.printf("CPF \n ");
				String T = teclado.nextLine();
				
				if(getMatricula() == getLogin() && getSenha() == s && T.equals(getCpf())) { // INICIO DO IF DE COMPARAÇAO SE LOGIN E SENHA SAO VALIDOS
					System.out.println("Bem vindo ao GIOCONDA"); // MENSAGEM DE SAUDAÇAO DO GIOCONDA 
					continuar = 0; // VARIAVEL PARA SAIR DO WHILE 
				} else { // ELSE DE COMPARAÇAO QUE LOGIN E SENHA NAO CONFEREM
					System.out.println("Login ou Senha  ou Cpf invalidos Tente novamente"); 
					System.out.println("1 para Sim ou 0 para nao"); // MENSAGEM PARA VOLTAR PARA O WHILE OU NAO
					continuar = teclado.nextInt(); // RECEBE O VALOR PARA CONTINUAR OU NAO
				 }// FIM DO ELSE
				} // FIM DO WHILE DE CONTINUAR OU NAO 

			System.out.println("the end \n"); // MENSAGEM DE ENCERRAMENTO DO PROGRAMA
		} // FIM DO METODO FAZER LOGIN

		
	}


