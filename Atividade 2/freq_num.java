import java.util.Random;

public class freq_num {

	public static void main(String[] args) {
		Random random = new Random();
        int[] numran = new int[50];
        int[] indice = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] contador = new int[10];
        
        for(int i=0;i<50;i++){
            numran[i] = random.nextInt(10)+1;
            System.out.println(numran[i]);
            for(int c=0;c<10;c++){
                if(numran[i] == indice[c]){
                    contador[c] = contador[c] + 1;
                }
            }
        }
        
        System.out.println("Numero de vezes em que o número foi repetido: ");
        for(int i=0;i<10;i++){
            System.out.println("Número "+(i+1)+": "+contador[i]);


	}

}
}
