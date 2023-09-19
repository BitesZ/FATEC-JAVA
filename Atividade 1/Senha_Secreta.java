import java.util.Scanner;

public class Senha_Secreta {

	public static void main(String[] args) {
		String senha = "python123";
		String v;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Digite uma senha: ");
			v = scanner.nextLine();
			if(v.equals(senha)) {
				System.out.println("Você acertou parabéns");
				break;
			}
			else {
				System.out.println("Você errou, tente novamente.\n");
			}
		}while(v != senha);
    scanner.close();
	}
}
