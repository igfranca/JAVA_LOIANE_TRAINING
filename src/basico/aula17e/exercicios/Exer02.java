package basico.aula17e.exercicios;

import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Exer02 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean infoValidas = false;
    String nomeUser, senha;

    do {
      System.out.println("Entre com o nome do usuário: ");
      nomeUser = sc.next();

      System.out.println("Entre com a senha: ");
      senha = sc.next();

        if (nomeUser.equalsIgnoreCase(senha)) {
          System.out.println("Senha igual a usuário, digite novamente");
        } else {
          infoValidas = true;
          System.out.println("Senha e usuários válidos.");
        }

    } while (!infoValidas);

    sc.close();
  }
}
