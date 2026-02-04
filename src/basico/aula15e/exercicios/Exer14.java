package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com a primeira nota: ");
    double nota1 = sc.nextInt();
    System.out.println("Entre com a segunda nota: ");
    double nota2 = sc.nextInt();

    double media = (nota1 + nota2) / 2;

    if (media >= 9) {
      System.out.println("Conceito A - Aprovado");
    } else if (media >= 7.5 && media < 9) {
      System.out.println("Conceito B - Aprovado");
    } else if (media >= 6 && media < 7.5) {
      System.out.println("Conceito C - Aprovado");
    } else if (media >= 4 && media < 6) {
      System.out.println("Conceito D - Reprovado");
    } else System.out.println("Conceito E - Reprovado");
    sc.close();
  }
}