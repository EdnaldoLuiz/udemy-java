package desafio17;

public class Ferrari extends Carro {

@Override
public int acelerar() {
  velocidade += 30;
  System.out.println("Acelerando, VRUMMMMM....");
  return velocidade;
}

@Override
public int frear() {
velocidade -= 10;
if (velocidade >= 10) {
  System.out.println("Freiando, PRRRRR........");
  } else if (velocidade <=10 && velocidade >=0) {
  System.out.println("Parando.....");
  } else {
	  velocidade = 0;
	    System.out.println("Carro parado!");
  }
  return velocidade;
}

}
