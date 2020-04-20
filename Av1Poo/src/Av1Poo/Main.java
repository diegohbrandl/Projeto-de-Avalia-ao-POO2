package Av1Poo;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Academico diego = new Academico(null, null, 0, null, null, null, null);
		
		/*diego.setNome("Diego Hartwig");
		//diego.setDataNascimento("24/05/1986");
		diego.setEstadoCivil("Casado");
		diego.setCpf("04455566669");
		diego.setRg("4567654");
		diego.setCurso("Sistema infformacao");
		diego.setMatricula(14596549);
		diego.setTurma("inf233");
		diego.setModalidadeEnsino("Presencial");*/
		
		diego.setMatricula(34);
		diego.criarLogin();	
		System.out.printf("\n\n" + diego.getMatricula());
		System.out.printf( diego.getSenha() +"\n\n");
		diego.fazerLogin();
		
		

	}

}

