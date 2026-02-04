package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer05 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as duas notas: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int media = a + b / 2;

    if (media >= 6 && media < 10) {
      System.out.println("Aprovado!");
    } else if (media < 6) {
      System.out.println("Reprovado!");
    } else if (media >= 10) {
      System.out.println("Aprovado com distinção!");
    }

    sc.close();
  }
}
