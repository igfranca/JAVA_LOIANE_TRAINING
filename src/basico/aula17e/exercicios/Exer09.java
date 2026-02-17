package basico.aula17e.exercicios;

public class Exer09 {
  public static void main(String[] args) {

    int calc;

    for (int i=0; i<=50; i++){
      calc = i % 3;
      if (calc != 0) {
        System.out.println(i);
      }
    }
  }
}
