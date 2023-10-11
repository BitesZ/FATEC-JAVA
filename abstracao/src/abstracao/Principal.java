package abstracao;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Todos os objetos/entidades:
		Computador comp1 = new Computador();
		Smartphone smart1 = new Smartphone();
		superHomem superman = new superHomem();
		cameraDigital camdig1 = new cameraDigital();
		Elefante elef = new Elefante();
		Carro car = new Carro();
		Motocicleta moto = new Motocicleta();
		Ventilador vent = new Ventilador();
		Aviao avi = new Aviao();
		Fotossintese fotosin = new Fotossintese();
		Danca danca = new Danca();
		
		
		//especificacoes do computador 1
		comp1.proc = "i7";
		comp1.mem = "8GB";
		comp1.ssd = "480GB";
		
		
		//especificacoes do smartphone 1
		smart1.proc = "Snapdragon 8 gen 1";
		smart1.mem = "8gb ram";
		
		
		//especificacoes da camera digital 1
		camdig1.proc = "DIGIC 4+";
		
		//especificações do carro 1
		car.motor = true;
		
		//especificações da moto 1
		moto.motor = true;
		
		//especificações do ventilador 1
		vent.botao = false;
		
		
		
		//Seleção
		int menu;
		String continuar;
		do {
		
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓"
							+"\n┃        Selecione uma das opções        ┃"
							+"\n┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫"
							+"\n┃1 - Computador         2 - Smartphone   ┃"
							+"\n┃                                        ┃"
							+"\n┃3 - Super-Homem        4 - Camera Dig.  ┃"
							+"\n┃                                        ┃"
							+"\n┃5 - Elefante           6 - Carro        ┃"
							+"\n┃                                        ┃"
							+"\n┃7 - Motocicleta        8 - Ventilador   ┃"
							+"\n┃                                        ┃"
							+"\n┃9 - Avião              10 - Fotossintese┃"
							+"\n┃                                        ┃"
							+"\n┃              11 - Dança                ┃"
							+"\n┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		menu = scanner.nextInt();
		scanner.nextLine();
		
		//CASE
		switch(menu) {
		case 1:
			//Computador
			System.out.println(comp1.ssd);
			if(comp1.ssd != null && comp1.mem != null && comp1.proc != null) {
			comp1.ligar();
			}
			System.out.println(comp1.desligar());
			break;
			
		case 2:
			//Smartphone
			
			if(smart1.mem != null && smart1.proc != null) {
				smart1.ligar();
				}
			System.out.println("Bem-vindo ao Motorola Edge 30 Neo");
			System.out.println("Especificações do aparelho: "+smart1.proc+" "+smart1.mem);
			
			//chamada da função
			menu = scanner.nextInt();
			switch(menu) {
			case 1:
				//Função armazenar
						
				System.out.println(smart1.armazenar());
				break;
			case 2:
				//Função fazer ligação
				
				System.out.println(smart1.fazerLigacao());
				break;
			default:
				System.out.println("Nenhum aplicativo selecionado.");
				break;
			}
			System.out.println(smart1.desligar());			
			break;
		case 3:
			//Super-Homem
			
			System.out.println("A partir de agora você é o super-homem e pode fazer o que bem entender,"
								+ " como o super herói você pode escolher dentre as seguintes opções: ");
			
			//seleção para chamada da função
			menu = scanner.nextInt();
			
			//case chamada da função
			switch (menu) {
			case 1:
				System.out.println(superman.lutar());
				break;
			case 2:
				System.out.println(superman.voar());
				break;
			case 3:
				System.out.println(superman.serRapido());
				break;
			case 4:
				System.out.println(superman.salvarVidas());
				break;
			default:
				System.out.println("Super-homem estava confuso em relação ao que ele deveria fazer e decidiu ir embora sem elaborar");
				break;
				
			}
			break;
		case 4:
			//Camera Digital
			
			//chamada da função;
			//função tirar foto
			System.out.println(camdig1.tirarFoto());
			break;
		case 5:
			//Elefante
			//chamada das funções Comer, Crescer, Beber Água e Andar
			System.out.println(elef.comer());
			System.out.println(elef.crescer());
			System.out.println(elef.beberAgua());
			System.out.println(elef.andar());
			break;
		case 6:
			//Carro
			
			//Chamada das funções Ligar, Acelerar, Frear e Desligar
			car.ligar();
			car.acelerar();
			car.frear();
			System.out.println(car.desligar());
			
			break;
		case 7:
			//Motocicleta
			
			//Chamada das funções Ligar, Acelerar, Frear e Desligar
			moto.ligar();
			moto.acelerar();
			moto.frear();
			System.out.println(moto.desligar());
			
			break;
		case 8:
			//Ventilador
			
			//Chamada das funções tirar calor e ventilar
			System.out.println(vent.tirarCalor());
			vent.ventilar();
			System.out.println(vent.tirarCalor());
			
			break;
		case 9:
			//Avião
			
			//Chamada das funções ligar, decolar, voar e desligar (faltou pousar mas acontece)
			avi.ligar();
			avi.decolar();
			avi.voar();
			System.out.println(avi.desligar());
			
			break;
		case 10:
			//Fotossíntese
			//???????????????????????????????????????
			System.out.println("?");
			
			break;
		case 11:
			//Dança
			//Un, dos, tres, Ave Maria, Un, dos, tres, un pasito pa'atras
			
			break;
		default:
			//Caso nenhuma das opções selecionadas
			System.out.println("Não selecionou nenhuma das opções, tente novamente.");
			break;
		}
		
		//Verificar se deseja continuar o teste do programa
			if(menu >= 1 && menu <= 11) {
				do {
					System.out.println("\nDeseja continuar? (Digitar S/N)");
					continuar = scanner.nextLine();
					if (continuar.equals("s")) {
						menu = 0;
						break;
					}
					else if (continuar.equals("n")) {
						System.out.println("\nO programa será encerrado...");
						break;
					}
					else {
						System.out.println("\nNão digitou uma das letras corretas, tente novamente.");
					}
				}while (!continuar.equals("s") && !continuar.equals("n"));
			}
		}while(menu < 1 || menu > 11);
		
		
		
			
	}

}
