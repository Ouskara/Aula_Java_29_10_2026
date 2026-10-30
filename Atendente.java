package aula_29_10_2026;

public class Atendente extends Funcionario {
	
	public Atendente(String nome, String cpf, double salario, String cargo, String departamento, double ajudadeCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudadeCusto = ajudadeCusto;
	}

	private double ajudadeCusto;
 
	public double getAjudadeCusto() {
		return ajudadeCusto;
	}

	public void setAjudadeCusto(double ajudadeCusto) {
		this.ajudadeCusto = ajudadeCusto;
	}
	 
	
}
