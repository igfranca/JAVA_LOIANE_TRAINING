package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer03 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite uma letra F/M: ");
    String letra = sc.nextLine();

    if (letra.equalsIgnoreCase("f")) {
      System.out.println("Você digitou F de Feminino");
    } else if (letra.equalsIgnoreCase("m")) {
      System.out.println("Você digitou M de Masculino");
    } else System.out.println("Inválido!");

  }
}
