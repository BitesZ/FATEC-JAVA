package abstracao;

public class Aviao {
	String cor;
	String tamanho;
	String potencia;
	boolean decolar = false;
	boolean voar = false;
	boolean ligado = false;
	boolean motor = true;
	
	boolean ligar() {
		if (motor == true) {
			System.out.println("Avião está ligado!");
			return ligado = true;
		}
		else {
			System.out.println("Avião não possui motor para ligar");
			return ligado = false;
		}
	}
	
	String desligar() {
		if (ligado == true) {
			return "Avião foi desligado!";
		}
		else {
			return "Avião não está ligado para desligar...";
		}
	}
	
	boolean voar() {
		if (motor == true && ligado == true && decolar == true) {
			System.out.println("Avião está voando...");
			return voar = true;
		}
		else {
			System.out.println("Avião não está ligado para voar.");
			return voar = false;
		}
	}

	Boolean decolar () {
		if (motor == true && ligado) {
			System.out.println("Avião decolou...");
			return decolar = true;
		}
		else {
			System.out.println("Avião não pode decolar...");
			return decolar = false;
		}
	}
}
