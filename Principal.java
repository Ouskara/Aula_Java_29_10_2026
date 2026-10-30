package aula_29_10_2026;

public class Principal {

	public static void main(String[] args) {
	
		// criando pessoa
		Pessoa pessoa = new Pessoa("Pedro Utsumi", "(15)99999-9999");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		// criando pessoa física
		PessoaFisica pessoaFisica = new PessoaFisica("Pedro Utsumi", "(15)99999-9999", "123.456.789.10", "50.052.000/0016-90");
		System.out.println("\nPessoa Física:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		// criando pessoa juridica
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Cofesa", "(15) 3542-0000", "50.052.000/0001-03");
		System.out.println("\nPessoa Jurídica:");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
	
		
		
	}

}
