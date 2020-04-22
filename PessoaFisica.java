package Av1Poo;


public abstract class PessoaFisica extends Pessoa{
	private String cpf;
	private String rg;//
	
	// Metodo Construtor
	
	public PessoaFisica(String cpf, String rg) {
		super();
		this.cpf = cpf;
		this.rg = rg;
	}
	
	//Metodos acessores
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
		//Metodos Principais
	
	public  String getInformacaoDados()  {
		String informacao = super.getInformacaoDados(); 
		return informacao + 
				"\n Cpf -->>>>> " + this.getCpf() +
				"\n Rg -->>>>> " + this.getRg();
		
	}
}
