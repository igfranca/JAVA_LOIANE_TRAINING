package basico.aula13e.exercicios;

import java.util.Scanner;

public class Exer04 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite as 4 notas: ");
    int a, b, c, d;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();

    double media = ((a + b + c + d) / 4);

    System.out.println("A média é: " + media);

  }
}
