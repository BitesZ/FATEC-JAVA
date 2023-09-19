import java.util.Random;

public class Cont_impar {

	public static void main(String[] args) {
		Random random = new Random();
        int[] numran = new int[30];
        int numimp = 0;
        
        for(int i=0;i<30;i++){
            numran[i] = random.nextInt(200);
            if(numran[i]%2 != 0) {
                numimp++;
            }
        System.out.println(numran[i]);
        }
        
        System.out.println("Qtd. de números impares: "+numimp);


	}

}
