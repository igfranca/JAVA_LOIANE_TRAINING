package basico.aula10;

public class Variaveis {
  public static void main(String[] args) {

    //Convenção Java
    int idade = 20;
    String nome = "Igor";
    String nomeDoMeuCachorro;

    //Aceito, mas não utilizado
    int _idade;
    int $idade;
    String ano2014;

    //Não é convenção Java
    String nome_do_meu_cachorro;
    String NomeDoMeuCachorro;
    String nomeDoMeucachorro;

    idade = 25;

    System.out.println("Idade = " + idade);
    System.out.println("Nome = " + nome);

    //Más práticas
    int a = 10;
    String b = "Igor";

  }
}
