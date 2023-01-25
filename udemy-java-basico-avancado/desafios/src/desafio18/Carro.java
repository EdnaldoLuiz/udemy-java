package desafio18;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	int velocidade;
	int delta = 5;
	
	Carro(int maxSpeed) {
		VELOCIDADE_MAXIMA = maxSpeed;
	}

	public int acelerar() {
		return velocidade += 5;
		
	}

	public int frear() {
		if(velocidade >= 5) {
			return velocidade -= 5;
		} else {
			return velocidade = 0;
		}
		
	}

}
