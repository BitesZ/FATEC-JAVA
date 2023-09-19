import java.util.Scanner;

public class Soma_numimpares {

	public static void main(String[] args) {
        int v;
        int ni = 1;
        int s = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        v = scanner.nextInt();
        scanner.close();
        for (int i = 0;i < v;i++) {
        	s += ni;
        	ni += 2;
        }
        
        System.out.println("A soma dos primeiros "+v+" números impares é: "+s);
        
        
	}
}
