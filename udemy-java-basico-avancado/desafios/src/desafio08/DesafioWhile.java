package desafio08;

import java.util.Scanner;

public class DesafioWhile {

  public static void main(String[] args73) {

  Scanner entrada = new Scanner(System.in);

  int quantNotas = 0;
  double nota = 0;
  double total = 0;

  while (nota != -1) {
    System.out.print("informe a nota: ");
   nota = entrada.nextDouble();

   if (nota <= 10 && nota >= 0) {
     total += nota;
     quantNotas++;
   } else if (nota != -1) {
     System.out.println("Nota inválida!");
   }
  }

  entrada.close();
  double media = total / quantNotas;
  System.out.println("Foram informadas " + quantNotas + " notas.");
  System.out.print("A média é: ");
  System.out.printf("%.2f", media);


  }

}