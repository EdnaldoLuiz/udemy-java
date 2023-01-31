package desafio19;

public class Civic extends Carro {

public Civic() {
		super(200);
}

@Override
public int frear() {
velocidade -= 5;
if (velocidade >= 5) {
  System.out.println("Freiando, PRRRRR........");
  } else if (velocidade <=5 && velocidade >=0) {
  System.out.println("Parando.....");
  } else {
	  velocidade = 0;
    System.out.println("Carro parado!");
  }
  return velocidade;
}

}