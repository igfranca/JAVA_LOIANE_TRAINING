package basico.aula17e.exercicios;

import java.util.Scanner;

public class Exer14 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num;
    int pares = 0;
    int impares = 0;

    for (int i=0; i<10; i++) {
      System.out.println("Entre com um número: ");
      num = sc.nextInt();

      if (num % 2 == 0) {
        pares++;
      } else {
        impares++;
      }
    }

    System.out.println("Pares: " + pares);
    System.out.println("Ímpares: " + impares);

    sc.close();
  }
}
