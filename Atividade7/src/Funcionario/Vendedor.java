package Funcionario;

public class Vendedor extends Funcionario {
	public Vendedor(String nome, double salario) {
		super(nome, salario);
	}
	protected void solicitarMaterial() {
		System.out.println("Vendedores não podem solicitar material.");
	}
}
