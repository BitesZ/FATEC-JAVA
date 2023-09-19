import java.util.Random;
import java.util.Scanner;

public class Adivinhe_num {

	public static void main(String[] args) {
		Random random = new Random();
        int numero = random.nextInt(100);
        int resposta;
        int div = numero/2;
        int men = div+numero;
        
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            resposta = scanner.nextInt();
            if(resposta > div && resposta < numero){
                System.out.println("Está perto, valor é maior");
            }
            else if(resposta < numero){
                System.out.println("Valor é maior");
            }
            else if(resposta < men && resposta > numero){
                System.out.println("Está perto, valor é menor");
            }
            else if(resposta > numero){
                System.out.println("Valor é Menor");
            }
        }while(resposta != numero);
        System.out.println("Você acertou!");


	}

}
