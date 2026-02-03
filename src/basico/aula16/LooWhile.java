package basico.aula16;

public class LooWhile {
  public static void main(String[] args) {

    int i = 0;
    int max = 10;

    System.out.println("Contando até " + max);

    while (i <= max) {
      System.out.println("Valor de i: " + i);
      i++; // i = i + 1; ou i += 1;
    }

    do {
      i ++;
      System.out.println("Valor de i: " + i);
    } while (i <  11);

  };
}