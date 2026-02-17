package basico.aula17e.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exer10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o primeiro número");
    int num1 = sc.nextInt();

    System.out.println("Entre com o segundo número");
    int num2 = sc.nextInt();

    for (int i=num1; i<=num2; i++){
      System.out.println(i);
    }
    sc.close();
  }
}
