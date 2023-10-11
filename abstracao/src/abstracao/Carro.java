package abstracao;

public class Carro {
		String cor;
		String marca;
		double valor;
		boolean motor = true;
		boolean ligado = false;
		boolean acelerado = false;
		boolean freio = false;
		
		boolean frear () {
			if (acelerado == true) {
				System.out.println("Carro foi freado");
				return freio = true;
			}
			else {
				System.out.println("Carro não está andando para poder frear.");
				return freio = false;
			}
		}
		
		boolean acelerar() {
			if (motor == true && ligado == true) {
				System.out.println("Carro está acelerando...");
				return acelerado = true;
			}
			else {
				System.out.println("Carro não está ligado para acelerar.");
				return acelerado = false;
			}
		}
		
		boolean ligar() {
			if (motor == true) {
				System.out.println("Carro está ligado!");
				return ligado = true;
			}
			else {
				System.out.println("Carro não possui motor para ligar");
				return ligado = false;
			}
		}
		
		String desligar() {
			if (ligado == true) {
				return "Carro foi desligado!";
			}
			else {
				return "Carro não está ligado para desligar...";
			}
		}
	
}
