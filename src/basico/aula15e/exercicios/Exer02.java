package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer02 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor: ");
    int valor = sc.nextInt();

    if (valor > 0) {
      System.out.println("Este valor é positivo " + valor);
    } else if (valor < 0) {
      System.out.println("Este valor é negativo " + valor);
    } else System.out.println("Número zero é neutro " + valor);


  }
}