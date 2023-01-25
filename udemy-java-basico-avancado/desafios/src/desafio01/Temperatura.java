package desafio01;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args21) {
		
		Scanner leitor = new Scanner(System.in);
		
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		double fahrenheit = leitor.nextDouble();
		double celsius = (fahrenheit - ajuste) * fator;
		
		System.out.printf("%.2f", celsius + "°");
		
		leitor.close();
		
	}

}
