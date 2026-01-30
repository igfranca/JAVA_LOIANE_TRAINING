package basico.aula15;

import java.util.Scanner;

public class Exer06 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite 3 números: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a > b && a > c) {
      System.out.println("Maior número: " + a);
    } else if (b > a && b > c) {
      System.out.println("Maior número: " + b);
    } else System.out.println("Maior número: " + c);

    sc.close();

  }
}
