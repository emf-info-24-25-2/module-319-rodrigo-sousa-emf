public class devoir6 {
    static int TAILLE_TABLEAU = 20;
    static int VALEUR_MIN = 0;
    static int VALEUR_MAX = 50;
    static int VALEUR_RECHERCHE = 7;

    public static int[] genereTableau(int min, int max, int taille) {

        int[] tableau = new int[taille]; 

        for (int i = 0; i < taille; i++) {
            tableau[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return tableau;
    }

    public static void main(String[] args) {
        //RIF: vous pourriez utilisé la constante que vous avez définie en haut
        int nbre_cher = 7;
        //RIF: attention a donner des noms de variables avec des minuscules -> tableau
        //RIF: de même dans les paramètres des méthodes
        int[] Tableau = genereTableau(VALEUR_MIN, VALEUR_MAX, TAILLE_TABLEAU);
        for (int i = 0; i < Tableau.length; i++) {
            System.out.println("Tableau[" + i + "] " + "= [" + Tableau[i] + "]");
        }

        System.out.println("La plus petite valeur trouvée est : " + rechercheMin(Tableau));
        System.out.println("La plus grande valeur trouvée est : " + rechercheMax(Tableau));
        System.out.println("Le nombre [" + nbre_cher + "] figure à la position ["
                + recherhceValeurqui(Tableau, nbre_cher) + "] du tableau");
    }

    public static int rechercheMin(int[] Tableau) {
        //RIF: il vaut mieux utiliser la constante ou la première case du tableau pour garantir la compatibilité de votre méthode quand on change les constantes
        int valMin = 50;
        for (int i = 0; i < Tableau.length; i++) {
            if (Tableau[i] < valMin) {
                valMin = Tableau[i];
            }
        }
        return valMin;
    }

    public static int rechercheMax(int[] Tableau) {
        int valMax = 0;
        for (int i = 0; i < Tableau.length; i++) {
            if (Tableau[i] > valMax) {
                valMax = Tableau[i];
            }
        }
        return valMax;
    }

    public static int recherhceValeurqui(int[] Tableau, int recherche) {
        int valRech = -1;
        for (int i = 0; i < Tableau.length; i++) {
            if (Tableau[i] == recherche) {
                valRech = i;
            }
        }

        return valRech;
    }

}
