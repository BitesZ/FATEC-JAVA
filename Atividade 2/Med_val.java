import java.util.Random;

public class Med_val {

	public static void main(String[] args) {
		Random random = new Random();
        
        int[] numran = new int[20];
        double total = 0;
        
        for (int i = 0; i < 20;i++){
            numran[i] = random.nextInt(500);
            total = total + numran[i];
            System.out.println((i+1)+") "+numran[i]);
        }
        System.out.println("\n"+"Soma de todos os números: "+total);
        System.out.println("Média: "+(total/20));

	}

}
