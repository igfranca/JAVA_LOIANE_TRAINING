package basico.aula17;

public class LoopFor {
  public static void main(String[] args) {

    System.out.println("---------------------------");
    //FOR normal
    for (int i=0; i<6 ; i++){
      System.out.println("i tem valor: " + i);
    }
    for (int i=6; i>-1 ; i--){
      System.out.println("i tem valor: " + i);
    }

    System.out.println("---------------------------");
    //FOR com mais de uma variável
    for (int i=0, j=10; i<j; i++, j--) {
      System.out.println("i = " + i + " j = " + j);
    }

    System.out.println("---------------------------");
    //FOR com partes ausentes
    int count = 0;
    for ( ; count < 5 ; ){
      System.out.println("Valor de count: " + count);
      count += 2;
    }

    System.out.println("---------------------------");
    //
    int soma = 0;
    for (int i=0; i<5; soma += i++) {
      System.out.println(soma);
    }
  }
}
