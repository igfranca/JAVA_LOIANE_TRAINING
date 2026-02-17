package basico.aula17e.exercicios;

import java.util.Scanner;

public class Exer05 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean valido = false;
    double popA, popB, taxaA, taxaB;

    do {
      System.out.println("Entre com a população A;");
      popA = sc.nextDouble();

      if (popA > 0){
        valido = true;
      } else {
        System.out.println("População A precisa ser maior que 0");
      }

    } while (!valido);

    valido = false;
    do {
      System.out.println("Entre com a população B;");
      popB = sc.nextDouble();

      if (popB > 0){
        valido = true;
      } else {
        System.out.println("População B precisa ser maior que 0");
      }

    } while (!valido);

    valido = false;
    do {
      System.out.println("Entre com a taxa de crescimento da população A");
      taxaA = sc.nextDouble();

      if (taxaA > 0){
        valido = true;
      } else {
        System.out.println("A taxa de crescimento precisa ser maior que 0");
      }

    } while (!valido);

    valido = false;
    do {
      System.out.println("Entre com a taxa de crescimento da população B");
      taxaB = sc.nextDouble();

      if (taxaB > 0){
        valido = true;
      } else {
        System.out.println("A taxa de crescimento precisa ser maior que 0");
      }

    } while (!valido);



    int cont = 0;

    while (popA <= popB) {
      popA += (popA / 100) * taxaA;
      popB += (popB / 100) * taxaB;
      cont++;
    }

    System.out.println("População A: " + popA);
    System.out.println("População B: " + popB);
    System.out.println("Qtd anos: " + cont);

  }
}