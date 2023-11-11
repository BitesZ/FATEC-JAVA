package Venda;

public class Disciplina {
	private String nome;
	private Aluno aluno;
	
	public Disciplina (String nome, Aluno aluno) {
		this.nome = nome;
		this.aluno = aluno;
	}
	
	public String Presenca () {
		return "Foi marcada presença de um aluno na disciplina";
	}
}
