package aula_29_10_2026;

public class Principal2 {

	public static void main(String[] args) {
	
	Funcionario funcionario = new Funcionario("Pedro", "012.345.789.01", 25000.00, "Funcionário Fantasma", "Filho");
	System.out.println("Funcionario:");
	System.out.println("Nome: " + funcionario.getNome());
	System.out.println("CPF: " + funcionario.getCpf());
	System.out.println("Salário" + funcionario.getSalario());
	System.out.println("Cargo: " + funcionario.getCargo());
	System.out.println("Departamento: " + funcionario.getDepartamento());
	
	Atendente atendente = new Atendente("Janio Quadros", "032.985.123-04", 1661.00, "Ex-Presidente", "Poder Executivo", 9.99);
	System.out.println("\nAtendente:");
	System.out.println("Nome: " + atendente.getNome());
	System.out.println("CPF: " + atendente.getCpf());
	System.out.println("Salário" + atendente.getSalario());
	System.out.println("Cargo: " + atendente.getCargo());
	System.out.println("Departamento: " + atendente.getDepartamento());
	System.out.println("Ajuda de Custo: " + atendente.getAjudadeCusto());
	
	Gerente gerente= new Gerente("Guilherme Briggs", "000.111.222.33",10000.00, "Dublador", "Direção", "1h a menos", 9999.99);
	System.out.println("\nGerente:");
	System.out.println("Nome: " + gerente.getNome());
	System.out.println("CPF: " + gerente.getCpf());
	System.out.println("Salário" + gerente.getSalario());
	System.out.println("Cargo: " + gerente.getCargo());
	System.out.println("Departamento: " + gerente.getDepartamento());
	System.out.println("Benefícios: " + gerente.getBeneficios());
	System.out.println("Premiação: "+ gerente.getPremiacao());
	
	

	}

}
