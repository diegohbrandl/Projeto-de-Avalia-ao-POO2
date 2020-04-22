package Av1Poo;

import java.lang.Exception;
public class Main {

	public static void main(String[] args) {
		
		Academico diego = new Academico(null, null, 0, null, null, null, null);
		FuncionarioPolo funci = new FuncionarioPolo(null, null, null);
		/*diego.setNome("Diego Hartwig");
		//diego.setDataNascimento("24/05/1986");
		diego.setEstadoCivil("Casado");
		diego.setCpf("04455566669");
		diego.setRg("4567654");
		diego.setCurso("Sistema infformacao");
		diego.setMatricula(14596549);
		diego.setTurma("inf233");
		diego.setModalidadeEnsino("Presencial");
		diego.setAtivo(false);
		diego.setMatricula(34);
		System.out.println(diego.getInformacaoDados());
		System.out.println(diego.getMatricula());
		diego.criarLogin();	
		//System.out.println("Login ->>>>>" + diego.getLogin());
		//System.out.println("Senha ->>>>>" +diego.getSenha());
		//System.out.printf("\n =============================== \n");
		diego.fazerLogin();*/
	//diego.criarSenha();
		//diego.setMatricula(34);
		//diego.setAtivo(true);
		//diego.cadastraLogin();
		//diego.cadastraSenha();
		//diego.fazerLogin();
		funci.setCpf("0909");
		funci.setAtivo(true);
		funci.setMatricula(43);
		System.out.println(" cpf " + funci.getCpf() );
		System.out.println("ativo " + funci.isAtivo());
		funci.cadastraLogin();
		funci.cadastraSenha();
		funci.fazerLogin();
		
	}

}

