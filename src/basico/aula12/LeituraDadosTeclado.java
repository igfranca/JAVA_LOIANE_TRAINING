package basico.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    /*System.out.println("Digite seu nome completo: ");
    String nomeCompleto = scan.nextLine();
    System.out.println("Seu nome completo é: " + nomeCompleto);

    System.out.println();

    System.out.println("Digite seu primeiro nome: ");
    String primeiroNome = scan.next();
    System.out.println("Seu primeiro nome é: " + primeiroNome);

    System.out.println();

    System.out.println("Digite a sua idade: ");
    int idade = scan.nextInt();
    System.out.println("Sua idade é: " + idade);

    System.out.println();

    System.out.println("Digite sua altura: ");
    double altura = scan.nextDouble();
    System.out.println("A sua altura é: " + altura);

    System.out.println();*/

    System.out.println("Digite seu nome, idade, altura");
    String nome1 = scan.next();
    int idade1 = scan.nextInt();
    float altura1 = scan.nextFloat();
    System.out.println("Você digitou os seguintes valores: ");
    System.out.println(nome1);
    System.out.println(idade1);
    System.out.println(altura1);

  }
}
