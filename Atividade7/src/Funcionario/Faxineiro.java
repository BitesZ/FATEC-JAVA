package Funcionario;

public class Faxineiro extends Funcionario {
	public Faxineiro (String nome, double salario) {
		super(nome, salario);
	}
	
	protected void fecharCaixa() {
		System.out.println("Faxineiros não podem fechar o caixa.");
	}
	protected void realizarVenda() {
		System.out.println("Faxineiros não realizam vendas.");
	}
}
