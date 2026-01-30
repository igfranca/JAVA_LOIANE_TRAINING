package basico.aula14;

import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int idade = sc.nextInt();

    if (idade >= 18) {
      System.out.println("É Maior de idade");
    } else System.out.println("Não é maior de idade");

  }
}
