package desafio07;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args67) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o dia da semana: ");
		String diaDaSemana = scanner.nextLine();
		
		if("domingo".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("dia 1");
		} else if ("segunda".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("dia 2");
		} else if ("terça".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("dia 3"); 
		} else if ("quarta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("dia 4");
		} else if ("quinta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("dia 5");
		} else if ("sexta".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("dia 6");
		} else if ("sabado".equalsIgnoreCase(diaDaSemana)) {
			System.out.println("dia 7");
		} else {
			System.out.println("dia invalido!");
		}
		
		scanner.close();
				
				

	}

}
