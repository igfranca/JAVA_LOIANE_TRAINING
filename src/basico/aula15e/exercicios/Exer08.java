package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer08 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o preço do primeiro produto: ");
    double valor1 = sc.nextDouble();

    System.out.println("Informe o preço do segundo produto: ");
    double valor2 = sc.nextDouble();

    System.out.println("Informe o preço do terceiro produto: ");
    double valor3 = sc.nextDouble();

    if ((valor1 <= valor2) && (valor1 <= valor3)) {
      System.out.println("Comprar o primeiro produto: " + valor1);
    } else if ((valor2 <= valor1) && (valor2 <= valor3)) {
      System.out.println("Comprar o segundo produto: " + valor2);
    } else System.out.println("Comprar o terceiro produto: " + valor3);

    sc.close();
  }
}
