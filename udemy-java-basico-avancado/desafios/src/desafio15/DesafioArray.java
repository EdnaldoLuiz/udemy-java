package desafio15;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args123) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe quantas notas deseja informar: ");
		int qtdNotas = scanner.nextInt(); 
		
		double notas[] = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a " + (i + 1) + "° nota: ");
			notas[i] = scanner.nextDouble();
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é: " + media);
		scanner.close();
		
		
	}

}
