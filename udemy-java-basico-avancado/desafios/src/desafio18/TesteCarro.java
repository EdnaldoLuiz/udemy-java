package desafio18;

public class TesteCarro {

	  public static void main(String[] args) {

	  Carro carro = new Civic();
	  carro.acelerar();
	  System.out.println(carro.velocidade + "Km/h");
	  carro.acelerar();
	  System.out.println(carro.velocidade + "Km/h");
	  carro.frear();
	  carro.frear();
	  carro.frear();
	  carro.frear();

	  carro.frear();
	  carro.frear();
	  carro.frear();
	  System.out.println(carro.velocidade + "Km/h");



	  }
}

	