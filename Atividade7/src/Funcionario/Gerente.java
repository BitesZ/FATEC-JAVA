package Funcionario;

public class Gerente extends Funcionario {
	public Gerente (String nome, double salario) {
		super(nome, salario);
	}
	protected void realizarVenda() {
		System.out.println("Gerentes não realizam vendas.");
	}
	protected void solicitarMaterial() {
		System.out.println("Gerentes não precisam solicitar material.");
	}
}
