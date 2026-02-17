package basico.aula17e.exercicios;

import java.util.Scanner;

public class Exer12 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num1 = 0;
    int calc = 0;

    System.out.println("Digite um número inteiro entre 1 e 10: ");
    num1 = sc.nextInt();

    while (num1 < 1 || num1 > 10){
      System.out.println("Digite um número inteiro entre 1 e 10: ");
      num1 = sc.nextInt();
    }

    System.out.println("Tabuada de " + num1);
    for (int i = 0; i <= 10; i++) {
      calc = num1 * i;
      System.out.println(num1 + " X " + i + " = " + calc);
    }

    sc.close();
  }
}
