package abstracao;

public class Ventilador {
	String helice;
	String tamanho;
	String cor;
	String potencia;
	Boolean botao = false;
	
	Boolean ventilar (){
		System.out.println("Ventilador foi ligado...");
		return botao = true;
	}
	
	String tirarCalor () {
		if (botao == true) {
			return "O tempo estava abafado e o ventilador ajudou a aliviar o calor";
		}
		else {
			return "Ventilador está desligado...";
		}
	}
	
	
}
