package Tela.app;

import java.util.ArrayList;

public class CalculadoraNumeros {

	
	public static double calcularMedia (ArrayList<Integer> numeros) throws IllegalArgumentException {
		if (numeros == null ||	numeros.isEmpty()) {
			throw new IllegalArgumentException ("A Lista de números não pode estar Vazia");
		}
		
		int soma = 0;
		for (int num : numeros) {
			soma += num;
		}
		
		return soma / numeros.size();
		
	}
}
