package Funcionario;

public class Principal {

	public static void main(String[] args) {
		Gerente func1 = new Gerente("Carvalho", 5000);
		Vendedor func2 = new Vendedor("Jamily", 2500);
		Faxineiro func3 = new Faxineiro("Santana", 1400);
		
		System.out.println("---Atividade 7 - Herança---\n\n");
		
		System.out.println("---Lista de Funcionários---\n");
		System.out.println("Gerentes: "+func1.getNome()+ "\n");
		System.out.println("Vendedores: "+func2.getNome()+ "\n");
		System.out.println("Faxineiros: "+func3.getNome()+ "\n");
		
		//Teste de funcionários que podem fechar o caixa;
		func3.fecharCaixa();
		func1.fecharCaixa();
		func2.fecharCaixa();
		
		System.out.println("\n");
		
		//Teste de funcionários que podem realizar vendas.
		func2.realizarVenda();
		func1.realizarVenda();
		func3.realizarVenda();
		
		System.out.println("\n");
		
		//Solicitação de material
		func3.solicitarMaterial();
		func2.solicitarMaterial();
		func1.solicitarMaterial();
		
		System.out.println("\n");
		
		//Teste de bater o ponto.
		func3.baterPonto();
		func2.baterPonto();
		func1.baterPonto();
	}

}
