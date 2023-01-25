package desafio17;

public class Carro {

int velocidade;

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
