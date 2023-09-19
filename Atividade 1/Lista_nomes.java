import java.util.Scanner;

public class Lista_nomes {

	public static void main(String[] args) {
        String[] nome = new String[5];
        Scanner scanner = new Scanner(System.in);
        String v;
        
        System.out.print("Digite 5 nomes para o array: ");
        for(int i=0;i<5;i++) {
        	nome[i] = scanner.nextLine();
        }
        
        System.out.print("\nDigite um nome: ");
        v = scanner.nextLine();
        for(int i=0;i<5;i++) {
        	if (v.equals(nome[i])) {
        		System.out.print("O nome "+v+" foi encontrado no array no "+(i+1)+"º indice.");
        		System.exit(0);
        	}
        }
        scanner.close();
        System.out.println("O nome "+v+" não foi encontrado no array");
	}
}
