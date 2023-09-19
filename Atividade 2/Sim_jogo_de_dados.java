import java.util.Random;

public class Sim_jogo_de_dados {

	public static void main(String[] args) {
	    Random random = new Random();
	    int[] dado1 = new int[100];
	    int[] dado2 = new int[100];
	    int soma7 = 0;
	    
	    //*Baseado nos dados tradicionais de 6 números*//
	    for(int i = 0; i<100; i++){
	        dado1[i] = random.nextInt(6);
	        dado2[i] = random.nextInt(6);
	        if (dado1[i]+dado2[i] == 7){
	            soma7++;
	        }
	        
	        System.out.println("Jogada "+(i+1)+" - "+"Dado 1: "+dado1[i]+" Dado 2: "+dado2[i]+" Soma dos dados: "+(dado1[i]+dado2[i]));
	    }
	    System.out.println("\nQuantidades de vezes em que a soma dos dados 1 e 2 foram igual a 7: "+soma7);


	}

}
