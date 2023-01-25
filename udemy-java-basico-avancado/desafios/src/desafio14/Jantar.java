package desafio14;

public class Jantar {
	
	public static void main(String[] args115) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Luiz";
		pessoa.pesoPessoa = 70;
		
		Comida comida = new Comida();
		comida.nome = "Coxinha";
		comida.pesoComida = 0.300;
		
		Comida janta = new Comida();
		janta.nome = "Lasanha";
		janta.pesoComida = 0.700;
		
		System.out.println("Pessoa antes da comida: " + pessoa.pesoPessoa);
		System.out.println("Pessoa depois da comida: " + pessoa.comer(comida));
		System.out.println("Pessoa depois da janta: " + pessoa.comer(janta));
	}

}
