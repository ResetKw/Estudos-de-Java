public class OperadoresMatematicos {
    public static void main(String args[]){
        int soma = 5+2;

        System.out.println("O valor da soma 5 + 2 = " + soma);

        int num1 = 5;

        int num2 = 2;

        int soma2 = num1 + num2;

        System.out.println("O valor da soma " + num1 + " + " + num2 + " = " + soma2);

        int subtracao = num1 - num2;

        System.out.println("O valor da subtracao entre " + num1 + "-" + num2 + "=" + subtracao);

        int multiplicacao = num1 * num2;

        System.out.println("O valor da multiplicacao entre " + num1 + " * " + num2 + " = " + multiplicacao);

        int divisao = num1/num2;

        System.out.println("O valor da divisao entre " + num1 + " / " + num2 + " = " + divisao);

        int mod = num1%num2;

        System.out.println("O valor do resto da divisão de " + num1 + "%" + num2 + "=" + mod);
    }
}