package desafio20;

public class Jantar {
	public static void main(String[] args165) {
		
		Pessoa eu = new Pessoa(60.00);
		
		Comida arroz = new Arroz(0.2);
		Comida feijao = new Feijao(1);
		Comida sorvete = new Sorvete(0.25);
		
		System.out.println(eu.getPeso());
		
		eu.comer(arroz);
		eu.comer(feijao);
		eu.comer(sorvete);
		
		System.out.println(eu.getPeso());
	}

}
