package Venda;

public class Principal {

	public static void main(String[] args) {
		
		//Composição
		Endereco end1 = new Endereco ("Praia Grande","Esmeralda");
		Pessoa pessoa1 = new Pessoa ("Jango Silva", end1);
		
		//Agregação
		Aluno aluno1 = new Aluno ("José Mango", 5768);
		Disciplina disc1 = new Disciplina ("Quimica", aluno1);
		
		System.out.println(aluno1.Presenca());
		System.out.println(disc1.Presenca());
		
		//Dependência
		Cupom cup1 = new Cupom ("Previa10");
		Compra compra1 = new Compra (560);
	}

}
