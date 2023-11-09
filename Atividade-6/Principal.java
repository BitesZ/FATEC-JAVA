package aplicacao.principal;
import automovel.carro.Carro;

public class Principal {

	public static void main(String[] args) {
		//Chamada do Construtor
		Carro ford = new Carro("Ford", "Fusion", 2020, 2.4, 200, 62);
		//Chamada de Getters
		System.out.println(ford.getMarca());
		System.out.println(ford.getGasolina());
		//Chamada dos metódos
		ford.girarChave();
		ford.encherTanque();
		ford.girarChave();
		ford.setVelocidade(200);
		//Teste do limite do aceleramento
		ford.acelerar();
		System.out.println(ford.getVelocidade());
		//Teste do Limite do freio
		ford.frear();
		ford.frear();
	}

}