package automovel.carro;

public class Carro {
	
	//Caracteristicas
	private String marca;
	private String modelo;
	private int ano;
	private boolean motor;
	private double velocidade = 0;
	public double velmin= 0;
	public double velmax;
	private double gasolina;
	public double gasmin= 0;
	public double gasmax;
	
	
	//Construtor
	public Carro(String marca, String modelo, int ano, double motor, double velmax, double gasmax) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.velmax = velmax;
		this.gasmax = gasmax;
		this.motor = false;
	}
	
	//Sistema para Ligar o Carro
	public double encherTanque(){
			this.gasolina += gasmax;
			return this.gasolina;
	}
	
	public boolean girarChave() {
		if(gasolina == 0){
			System.out.println("Não ligou");
			return this.motor = false;
		}
		else {
			System.out.println("Ligou");
			return this.motor = true;
		}
	}
	
	//sistema de aceleramento e freio
	
	//Aceleramento
	public double acelerar() {
		if(velocidade >= velmax) {
			System.out.println("Veículo já está em sua velocidade máxima!");
			return this.velocidade;
		}
		else{
			if(motor == true) {
			this.velocidade+=20;
			return this.velocidade;
			}
			else {
				System.out.println("Motor não está ligado para acelerar");
				return this.velocidade;
			}
		}
	}
	
	//Freio
	public double frear() {
		if(velocidade <= velmin) {
			System.out.println("Veículo não está em movimento para freiar!");
			return this.velocidade;
		}
		else {
			if(motor == true) {
			this.velocidade=0;
			return this.velocidade;
			}
			else {
				System.out.println("Motor não está ligado para freiar");
				return this.velocidade;
			}
		}
	}
	
	
	//GETTERS E SETTERS
	
	//velocidade
	public double getVelocidade() {
		return this.velocidade;
	}
	public void setVelocidade(double vel) {
		this.velocidade += vel;
	}
	
	//marca
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}
	
	//modelo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//ano
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Velocidade minima
	public double getVelmin() {
		return velmin;
	}
	public void setVelmin(double velmin) {
		this.velmin = velmin;
	}
	
	//Velocidade maxima
	public double getVelmax() {
		return velmax;
	}
	public void setVelmax(double velmax) {
		this.velmax = velmax;
	}
	
	//Gasolina
	public double getGasolina() {
		return gasolina;
	}
	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}
	
	//Qtd minima de gasolina
	public double getGasmin() {
		return gasmin;
	}
	public void setGasmin(double gasmin) {
		this.gasmin = gasmin;
	}
	
	//Qtd maxima de gasolina
	public double getGasmax() {
		return gasmax;
	}
	public void setGasmax(double gasmax) {
		this.gasmax = gasmax;
	}

	//Motor
	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	
}
