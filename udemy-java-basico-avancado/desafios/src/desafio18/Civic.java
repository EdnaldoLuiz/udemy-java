package desafio18;

public class Civic extends Carro {

@Override
public int acelerar() {
  velocidade += 15;
  System.out.println("Acelerando, VRUMMMMM....");
  return velocidade;
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