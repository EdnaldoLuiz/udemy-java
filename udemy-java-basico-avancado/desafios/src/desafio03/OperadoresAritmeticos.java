package desafio03;

public class OperadoresAritmeticos {
	
	public static void main(String[] args43) {
		
		int numA = (int) Math.pow(6 * (3 + 2), 2);
		int denA = 3 * 2;
		
		int numB = (1 - 5) * (2 - 7);
		int denB = 2;
		
		int cimaEsquerda = numA / denA;
		int cimaDireita = (int) Math.pow(numB / denB, 2);
		
		int totalCima = (int) Math.pow(cimaEsquerda - cimaDireita, 3);
		
		int divisor = (int) Math.pow(10, 3);
		
		int resultado = (int) totalCima / divisor;
	
	
		System.out.println(resultado);
		
		
	}

}
