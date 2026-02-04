package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer09 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o preço do primeiro produto: ");
    double valor1 = sc.nextDouble();

    System.out.println("Informe o preço do segundo produto: ");
    double valor2 = sc.nextDouble();

    System.out.println("Informe o preço do terceiro produto: ");
    double valor3 = sc.nextDouble();

    if ((valor1 <= valor2) && (valor1 <= valor3) && (valor2 <= valor3)){
      //valor1 é menor
      //valor3 é maior
      //valor1 < valor2 < valor3
      System.out.println(valor3 + " - " + valor2 + " - " + valor1);

    } else if ((valor1 <= valor2) && (valor1 <= valor3) && (valor3 <= valor2)){
      //valor1 é menor
      //valor2 é maior
      //valor1 < valor3 < valor2
      System.out.println(valor2 + " - " + valor3 + " - " + valor1);

    } else if ((valor2 <= valor1) && (valor2 <= valor3) && (valor1 <= valor3)){
      //valor2 é menor
      //valor3 é maior
      //valor2 < valor1 < valor3
      System.out.println(valor3 + " - " + valor1 + " - " + valor2);

    } else if ((valor2 <= valor1) && (valor2 <= valor3) && (valor3 <= valor1)){
      //valor2 é menor
      //valor1 é maior
      //valor2 < valor3 < valor1
      System.out.println(valor1 + " - " + valor3 + " - " + valor2);

    } else if ((valor3 <= valor1) && (valor3 <= valor2) && (valor1 <= valor2)){
      //valor3 é menor
      //valor2 é maior
      //valor3 < valor1 < valor2
      System.out.println(valor2 + " - " + valor1 + " - " + valor3);

    } else if ((valor3 <= valor1) && (valor3 <= valor2) && (valor2 <= valor1)){
      //valor3 é menor
      //valor1 é maior
      //valor3 < valor2 < valor1
      System.out.println(valor1 + " - " + valor2 + " - " + valor3);
    }

    sc.close();
  }
}