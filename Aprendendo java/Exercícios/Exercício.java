package Exercícios;

import java.util.Scanner;
public class Exercício {
    public static void main(String args[]){
        Scanner opcao = new Scanner(System.in);
        int caso = 0;
        int num1 = 0;
        int num2 = 0;

        System.out.println("Multiplicação(1),Soma(2),subtração(3),divisão(4),mod(5)");
        caso = opcao.nextInt();

        switch (caso) {

            case 1:
                System.out.println("Número 1");
                num1 = opcao.nextInt();
                System.out.println("Número 2");
                num2 = opcao.nextInt();

                int multi = num1 * num2;

                System.out.println("Resultado é " + multi);

                break;

            case 2:
                System.out.println("Número 1");
                num1 = opcao.nextInt();
                System.out.println("Número 2");
                num2 = opcao.nextInt();

                int soma = num1 + num2;

                System.out.println("Resultado é " + soma);

                break;

            case 3:
                System.out.println("Número 1");
                num1 = opcao.nextInt();
                System.out.println("Número 2");
                num2 = opcao.nextInt();

                int sub = num1 - num2;

                System.out.println("Resultado é " + sub);

                break;

            case 4:
                System.out.println("Número 1");
                num1 = opcao.nextInt();
                System.out.println("Número 2");
                num2 = opcao.nextInt();

                int divi = num1 / num2;

                System.out.println("Resultado é " + divi);

                break;
            case 5:
                System.out.println("Número 1");
                num1 = opcao.nextInt();
                System.out.println("Número 2");
                num2 = opcao.nextInt();

                int mod = num1 % num2;

                System.out.println("Resultado é " + mod);

                break;

            default:
                System.out.println("Número não está na lista");
        }
    }
}
