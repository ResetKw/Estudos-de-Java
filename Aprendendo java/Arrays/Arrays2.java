package Arrays;

public class Arrays2 {
    public static int somaDosElementosDoArray(int[] idadeAlunos) {

        int acumularSoma = 0;

        for(int i=0; i < 5; i++) {
            acumularSoma = acumularSoma + idadeAlunos[i];
        }
        return acumularSoma;
    }

    public static void main(String args[]) {

        int[] idadeAlunos = new int[5];
        idadeAlunos[0] = 10;
        idadeAlunos[1] = 11;
        idadeAlunos[2] = 13;
        idadeAlunos[3] = 12;
        idadeAlunos[4] = 11;

        int somaDasIdades = somaDosElementosDoArray(idadeAlunos);
    }
}
