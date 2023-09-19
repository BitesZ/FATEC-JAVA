import java.util.Random;

public class Array_num {

	public static void main(String[] args) {
		Random random = new Random();
        int[] numran = new int[10];
        int par = 0;
        
        for(int i = 0;i<10;i++){
            numran[i] = random.nextInt(100);
            if (numran[i] % 2 == 0) {
                System.out.println(numran[i]);
                par++;
            }
        }
        System.out.println("Um total de "+par+" números pares");

	}

}
