package abstracao;
import java.util.Scanner;

public class Smartphone {
	String tela;
	String proc;
	String mem;
	String tam;
	Scanner scanner = new Scanner(System.in);
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
			return "Não está ligando!";
			}
		}
	
	String armazenar() {
		String info;
		System.out.println("Digite uma informação a ser armazenadas: ");
		info = scanner.nextLine();
		
		return ("Informa��o armazenada: "+ info);
	}
	
	String fazerLigacao() {
		String numero;
		System.out.println("Digite um número para fazer uma ligação: ");
		numero = scanner.nextLine();
		
		System.out.println("Fazendo liga��o para "+numero);
		
		
		return ("O Numero "+numero+" nao respondeu a liga��o");
	}
}
