public class Condicionais2 {
    public static void main(String args[]) {
        int idade1 = 60;
        int idade2 = 50;
        int idadeMaior;

        idadeMaior = idade1 > idade2 ? idade1 : idade2; /* idadeMaior vai receber o valor de idade1 se
                                                        a condição for verdadeira, caso contrário idadeMaior
                                                         vai receber o valor de idade2 */
        System.out.println(idadeMaior);
    }
}
