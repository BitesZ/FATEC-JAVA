import java.util.Random;

public class Num_max_min {

	public static void main(String[] args) {
        Random random = new Random();
        int[] numran = new int[15];
        int menor = 0, maior = 0;
        
        for(int i=0;i<15;i++){
            numran[i] = random.nextInt(300);
            if(menor == 0){
                menor = numran[i];
            }
            else if(numran[i] < menor){
                menor = numran[i];
            }
            if(maior == 0){
                maior = numran[i];
            }
            else if (numran[i] > maior){
                maior = numran[i];
            }
            System.out.println(numran[i]);
        }
        
        System.out.println("\n"+"Maior valor: "+maior);
        System.out.println("Menor valor: "+menor);

	}

}
