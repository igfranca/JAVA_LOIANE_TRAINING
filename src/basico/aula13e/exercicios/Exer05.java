package basico.aula13e.exercicios;

import java.util.Scanner;

public class Exer05 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com a quantidade de metros");
    double metros = sc.nextDouble();

    double cm = metros * 100;

    System.out.println(metros + " m é igual a " + cm + " cm");

  }
}
