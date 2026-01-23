package basico.aula13;

import java.sql.PreparedStatement;

public class OperadoresAritmeticos {
  public static void main(String[] args) {

    int result = 1 + 2;
    System.out.println(result);

    result = result - 1;
    System.out.println(result);

    result = result * 2;
    System.out.println(result);

    result = result / 2;
    System.out.println(result);

    result = result + 8;
    System.out.println(result);

    result = result % 7;
    System.out.println(result);

    String primeiroNome = "Esta é";
    String segundoNome = " uma String concatenada.";
    String terceiroNome = primeiroNome + segundoNome;
    System.out.println(terceiroNome);

    result = result + 1;
    System.out.println(result);

    result++;
    System.out.println(result);

    //5
    System.out.println(result++);
    //mesma coisa que
    //System.out.println(result);
    //result = result + 1;
    //result += 1;

    System.out.println(++result);
    //mesma coisa que
    //resultado += 1;
    //System.out.println(result);

    System.out.println(result--); //Primeiro imprime o valor e depois retira 1
    System.out.println(--result); //Primeiro retira 1 do valor e depois imprime

  }
}
