package abstracao;

public class Computador {
	String proc;
	String mem;
	String ssd;
	boolean ligado = false;
	
	void ligar() {
		System.out.println("Ligando...");
		System.out.println("Ligado!");
		ligado = true;
	}
	
	String desligar() {
		if (ligado == true) {
			return "Desligando... Desligado";
		}
		else {
			return "N�o est� ligado!";
		}
	}
}
