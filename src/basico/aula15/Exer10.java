package basico.aula15;

import java.util.Scanner;

public class Exer10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Em que turno você estuda, M-matutino, V-vespertino ou N-noturno: ");
    String valor = sc.next();

    switch (valor) {
      case "m":
      case "M":
        System.out.println("Bom dia!");
        break;
      case "n":
      case "N":
        System.out.println("Boa noite!");
        break;
      case "v":
      case "V":
        System.out.println("Boa tarde!");
        break;
      default:
    }
    sc.close();
  }
}