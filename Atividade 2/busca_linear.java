import java.util.Random;
import java.util.Scanner;

public class busca_linear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    Random random = new Random();
	    int[] numran = new int[25];
	    int num, v = 0;
	    
	    
	    for (int i = 0; i<25; i++){
	        numran[i] = random.nextInt(200);
	        System.out.println(numran[i]);
	    }
	    
	    System.out.print("\n\nDigite um valor: ");
	    num = scanner.nextInt();
	    scanner.close();
	    for (int i = 0; i<25; i++){
	        if (num == numran[i]) {
	            v = i;
	            break;
	        }
	    }
	    
	    if (num == numran[v]) {
	            System.out.println("O valor "+num+" foi encontrado no array no "+(v+1)+"º indice do array");
	        }
	    else if (num != numran[v]) {
	            System.out.println("O valor "+num+" não foi encontrado no array...");


	}

}
}
