package desafio19;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	public int velocidade;
	protected int delta = 5;
	
	Carro(int maxSpeed) {
		VELOCIDADE_MAXIMA = maxSpeed;
	}

	public int acelerar() {
		if(velocidade + delta > VELOCIDADE_MAXIMA) {
			return velocidade = VELOCIDADE_MAXIMA;
		} else {
		return velocidade += delta;
		}
	}

	public int frear() {
		if(velocidade >= 5) {
			return velocidade -= 5;
		} else {
			return velocidade = 0;
		}
		
	}

}
