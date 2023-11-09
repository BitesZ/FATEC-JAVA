package Funcionario;
import java.util.Date;
public class Funcionario {
	private String nome;
	private double salario;
	public Date dataAtual = new Date();
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void baterPonto() {
		System.out.println("Funcionário "+ nome +" bateu o ponto ("+ dataAtual +").");
	}
	protected void solicitarMaterial() {
		System.out.println("Funcionário "+ nome +" fez a solicitação de material.");
	}
	protected void realizarVenda() {
		System.out.println("Funcionário "+ nome +" realizou uma venda.");
	}
	protected void fecharCaixa() {
		System.out.println("Funcionário "+ nome +" fechou o caixa.");
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
