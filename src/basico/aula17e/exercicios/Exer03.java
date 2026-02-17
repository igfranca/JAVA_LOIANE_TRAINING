package basico.aula17e.exercicios;

import java.util.Scanner;

public class Exer03 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean infoValida = false;
    String nome, sexo, estadoCivil;
    int idade;
    double salario;

    do {
      System.out.println("Entre com o nome: ");
      nome = sc.next();
      if (nome.length() >= 3){
        infoValida = true;
      } else {
        System.out.println("Nome precisa nom mínimo 3 caracteres.");
      }
    } while (!infoValida);

    infoValida = false;
    do {
      System.out.println("Entre com o idade: ");
      idade = sc.nextInt();
      if (idade >= 0 && idade <= 150){
        infoValida = true;
      } else {
        System.out.println("Idade precisa ser entre 0 e 150.");
      }
    } while (!infoValida);

    infoValida = false;
    do {
      System.out.println("Entre com o salário: ");
      salario = sc.nextDouble();
      if (salario > 0){
        infoValida = true;
      } else {
        System.out.println("Salário precisa ser maior que 0.");
      }
    } while (!infoValida);

    infoValida = false;
    do {
      System.out.println("Entre com o sexo: ");
      sexo = sc.next();
      if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
        infoValida = true;
      } else {
        System.out.println("Sexo precisa ser 'F' ou 'M'.");
      }
    } while (!infoValida);

    infoValida = false;
    do {
      System.out.println("Entre com o Estado Civil: ");
      estadoCivil = sc.next();
      if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
      || estadoCivil.equalsIgnoreCase("d")){
        infoValida = true;
      } else {
        System.out.println("Estado Civil precisa ser 'S', 'C', 'V' ou 'D'.");
      }
    } while (!infoValida);

    System.out.println("As seguinte informações foram coletadas: ");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salario: " + salario);
    System.out.println("Sexo: " + sexo);
    System.out.println("Estado Civil: " + estadoCivil);

    sc.close();
  }
}
