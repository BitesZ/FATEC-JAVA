package abstracao;

public class Motocicleta {
	String marca;
	String cor;
	String modelo;
	int ano;
	boolean motor = true;
	boolean ligado = false;
	boolean acelerado = false;
	boolean freio = false;
	
	boolean frear () {
		if (acelerado == true) {
			System.out.println("Moto foi freada");
			return freio = true;
		}
		else {
			System.out.println("Moto não está andando para poder frear.");
			return freio = false;
		}
	}
	
	boolean acelerar() {
		if (motor == true && ligado == true) {
			System.out.println("Moto está acelerando...");
			return acelerado = true;
		}
		else {
			System.out.println("Moto não está ligada para acelerar.");
			return acelerado = false;
		}
	}
	
	boolean ligar() {
		if (motor == true) {
			System.out.println("Moto está ligada!");
			return ligado = true;
		}
		else {
			System.out.println("Moto não possui motor para ligar");
			return ligado = false;
		}
	}
	
	String desligar() {
		if (ligado == true) {
			return "Moto foi desligada!";
		}
		else {
			return "Moto não está ligada para desligar...";
		}
	}

}
