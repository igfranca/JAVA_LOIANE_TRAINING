package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com o tipo da carne: ");
    System.out.println("1 - File duplo");
    System.out.println("2 - Alcatra");
    System.out.println("3 - Picanha");
    int tipo = sc.nextInt();

    System.out.println("Entre com a quantidade (kg): ");
    double qtd = sc.nextDouble();
    double precoKd = 0;

    if (tipo == 1) {
      System.out.println(qtd + "Kg - File Duplo");
      if (qtd < 5){
        precoKd = 4.9;
      } else {
        precoKd = 5.8;
      }
    } else if (tipo == 2) {
      System.out.println(qtd + "Kg - Alcatra");
      if (qtd < 5){
        precoKd = 5.9;
      } else {
        precoKd = 6.8;
      }
    } else if (tipo == 3) {
      System.out.println(qtd + "Kg - Picanha");
      if (qtd < 5){
        precoKd = 6.9;
      } else {
        precoKd = 7.8;
      }
    }

    double total = qtd * precoKd;
    System.out.println(qtd + "kg * " + precoKd + " = " + total);

    System.out.println("Compra no cartão? Digite 1 para sim: ");
    int cartao = sc.nextInt();

    if (cartao == 1) {
      double desconto = (total / 100) * 5;
      System.out.println("Desconto de: " + desconto);
      System.out.println("Valor a pagar: " + (total - desconto));
    } else {
      System.out.println("Valor a pagar: " + total);
    }

    sc.close();
  }
}
