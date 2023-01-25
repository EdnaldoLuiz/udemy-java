package desafio05;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args56) {
		
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Informe a operação: ");
	String operacao = scanner.nextLine();
	
    System.out.print("Informe o primeiro valor: ");
	double num1 = scanner.nextDouble();
	System.out.print("Informe o segundo valor: ");
	double num2 = scanner.nextDouble();
	
	double resultado = "+".equals(operacao) ? num1 + num2 : 0;
	resultado = "adição".equalsIgnoreCase(operacao) ? num1 + num2 : resultado;
	
	resultado = "-".equals(operacao) ? num1 - num2 : resultado;
	resultado = "subtração".equalsIgnoreCase(operacao) ? num1 - num2 : resultado;
	
	resultado = "*".equals(operacao) ? num1 * num2 : resultado;
	resultado = "multiplicação".equalsIgnoreCase(operacao) ? num1 * num2 : resultado;
	
	resultado = "%".equals(operacao) ? num1 % num2 : resultado;
	resultado = "resto divisão".equalsIgnoreCase(operacao) ? num1 % num2 : resultado;
	
	resultado = "/".equals(operacao) ? num1 / num2 : resultado;
	resultado = "divisão".equalsIgnoreCase(operacao) ? num1 / num2 : resultado;
	
	System.out.println(resultado);
	
	scanner.close();
	
	
	
	

}
}
