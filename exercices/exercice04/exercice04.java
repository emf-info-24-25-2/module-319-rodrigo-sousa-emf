package exercices.exercice04;

public class exercice04 {
    static int variable1 = 1;
    static int variable2 = 2;
    static int variableswap;
    public static void main(String[] args) {
        System.out.println("Le contenu de la variable1 est : " + variable1);
        System.out.println("Le contenu de la variable2 est : " + variable2);

        System.out.println(".... traitement ....");
        variableswap = variable1;
        variable1 = variable2;
        variable2 = variableswap;

        System.out.println("Le contenu de la variable1 est : " + variable1);
        System.out.println("Le contenu de la variable2 est : " + variable2);

    }
}
