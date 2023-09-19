import java.util.Scanner;

public class Faixa_etaria {

	public static void main(String[] args) {
        int resposta;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        resposta = scanner.nextInt();
        scanner.close();
        
        if(resposta < 18) {
        	System.out.println("Você é menor de idade");
        }
        else if(resposta > 18 && resposta < 60) {
        	System.out.println("Você é maior de idade/adulto");
        }
        else if(resposta >= 60) {
        	System.out.println("Você é um IDOSO");
        }
	}
}
