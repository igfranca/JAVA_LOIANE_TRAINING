package basico.aula17e.exercicios;

import java.util.Scanner;

public class Exer01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma nota entre 0 e 10: ");
    int nota = sc.nextInt();
    while (nota < 0 || nota > 10) {
      System.out.println("Digite uma nota válida: ");
      nota = sc.nextInt();
    }
    System.out.println("Nota válida: " + nota);
  }
}
