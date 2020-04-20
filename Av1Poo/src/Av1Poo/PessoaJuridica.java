package Av1Poo;


public abstract class PessoaJuridica extends Pessoa{
	private String razaoSocial;
	private String cnpj;
	
	//Metodos acessores
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// Metodos Principais
	
	public  String getInformacaoDados()  {
		String informacao = super.getInformacaoDados();
		return informacao +
				"\n Razao Social: " + this.getRazaoSocial() +
				"\n Cnpj: " + this.getCnpj();
		
	}
}
