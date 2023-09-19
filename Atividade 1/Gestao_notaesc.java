import java.util.Scanner;

public class Gestao_notaesc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantas disciplina o aluno possuí no semestre? ");
		int d = scanner.nextInt();
		System.out.print("Qual a média para aprovação? ");
		double ma = scanner.nextDouble();
		
		String[] nomedisc = new String[d];
		double[] np1 = new double[d];
		double[] np2 = new double[d];
		double[] tp = new double[d];
		
		for(int i=0;i<d;i++) {
			
			System.out.print("Digite o nome da "+(i+1)+"º disciplina: ");
			nomedisc[i] = scanner.next();
			
			System.out.print("Nota da P1: ");
			np1[i] = scanner.nextDouble();
			
			System.out.print("Nota da P2: ");
			np2[i] = scanner.nextDouble();
			
			System.out.print("Nota do trabalho: ");
			tp[i] = scanner.nextDouble();
		}
		scanner.close();
		System.out.println("\nBoletim do aluno\n");
		for(int i=0;i<d;i++) {
			double md = (np1[i]+np2[i]+tp[i]) /3;
			String sit = (md >= ma) ? "Aprovado" : "Reprovado";
			
			System.out.println("Nome da disciplina: "+nomedisc[i]+" \nMedia da disciplina: "+md+" \nSituação: "+sit+"\n");
			
		}
	}
}
