package basico.aula17e.exercicios;

import java.util.Scanner;

public class Exer13 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com a base: ");
    int base = sc.nextInt();

    System.out.println("Entre com a potência: ");
    int pot = sc.nextInt();

    int resultado = base;

    for (int i=1; i<pot; i++) {
      resultado *= base;
    }

    System.out.println("Resultado: " + resultado);

    sc.close();
  }
}
