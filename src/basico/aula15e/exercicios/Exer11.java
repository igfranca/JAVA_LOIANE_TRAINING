package basico.aula15e.exercicios;

import java.util.Scanner;

public class Exer11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o salário: ");
    double salario = sc.nextDouble();
    String percentual = "";
    double salario1 = 0;

    if (salario <= 280) {
      salario1 = salario + (salario * 20 / 100);
      percentual = "20%";
    } else if (salario > 280 && salario < 700) {
      salario1 = salario + (salario * 15 / 100);
      percentual = "15%";
    } else if (salario >= 700 && salario < 1500) {
      salario1 = salario + (salario * 10 / 100);
      percentual = "10%";
    } else if (salario >= 1500) {
      salario1 = salario + (salario * 5 / 100);
      percentual = "5%";
    }
    
    System.out.println("Salário base: " + salario);
    System.out.println("Percentual aumento: " + percentual);
    System.out.println("Valor total: " + salario1);

    sc.close();
  }
}
