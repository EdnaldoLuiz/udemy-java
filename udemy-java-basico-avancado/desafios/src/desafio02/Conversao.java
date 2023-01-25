package desafio02;

import java.util.Scanner;

public class Conversao {
	
	public static void main(String[] args37) {
		
	
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Informe o primeiro salário: ");
	String salario1 = scanner.nextLine().replace(",", ".");
	System.out.print("Informe o segundo salário: ");
	String salario2 = scanner.nextLine().replace(",", ".");
	System.out.print("Informe o terceiro salário: ");
	String salario3 = scanner.nextLine().replace(",", ".");
	
	scanner.close();
	
	double valor1 = Double.parseDouble(salario1);
	double valor2 = Double.parseDouble(salario2);
	double valor3 = Double.parseDouble(salario3);
	
	
	double media = (valor1 + valor2 + valor3) / 3;
	System.out.printf("Sua média salárial é: " + "%.2f", media);

}
}
