package desafio04;

public class OperadoresLogicos {
	
	public static void main(String[] args47) {
		
		boolean trab1 = true;
		boolean trab2 = true;
		
		boolean comprouTVde32 = trab1 ^ trab2;
		boolean comprouTVde50 = trab1 && trab2;
		
		boolean tomouSorvete = trab1 || trab2;
		boolean naoTomouSorvete = !tomouSorvete;
		
		System.out.println("Comprou TV de 32\"?" + comprouTVde32);
		System.out.println("Comprou TV de 50\"?" + comprouTVde50);
		System.out.println("Tomou sorvete?" + tomouSorvete);
		System.out.println("Mais saúdavel?" + naoTomouSorvete);
		
	}

}
