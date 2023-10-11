package abstracao;

public class Elefante {
	double peso;
	int idade;
	int tamanho;
	boolean selvagem;
	
	String comer() {
		return "Elefante comeu amendoin";
	}
	
	String crescer() {
		return "Anos se passaram e o elefante cresceu";
	}
	
	String beberAgua() {
		return "Elefante bebeu muita água";
	}
	
	String andar() {
		return "Elefante andou um total de 1 km";
	}
}
