package aula_29_10_2026;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica(String nome, String telefone, String cnpj) {
		super(nome, telefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCpnj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	

}
