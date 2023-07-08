package funcoesemetodos;

public class funcoesemetodos {
    public static int soma(int a, int b) {

        int c = a + b;

        return c;
    }
    public static void mostrar(int x) {
        //x é uma variável qualquer passada por parametro
        System.out.println(x); //mostra o conteudo que veio em x.
    }


    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        int c = soma(a, b); //chamando a funcao e atribuindo o que retorna dela na variável c. É passado por parâmetro os valores que você quer somar e a variável que vai receber deve ser do tipo de retorno da função.

        mostrar(c); //chamando uma função sem retorno que mostra a variável passada por paramêtro.
    }
}
