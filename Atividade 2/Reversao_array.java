import java.util.Random;

public class Reversao_array {

	public static void main(String[] args) {
		Random random = new Random();
        int[] numran = new int[10];
        
        System.out.println("Ordem normal: ");
        for(int i=0;i<10;i++){
            numran[i] = random.nextInt(200);
            System.out.print(numran[i]+" ");
        }
        
        System.out.println("\n\n"+"Ordem reversa: ");
        for(int i=9;i >= 0;i--){
            System.out.print(numran[i]+" ");


	}

}
}
