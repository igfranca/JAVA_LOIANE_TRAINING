package basico.aula15;

import java.util.Scanner;

public class Exer01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois numeros: ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a > b){
      System.out.println("Este é o maior número: " + a);
    } else System.out.println("Este é o maior número: " + b);

  }
}
