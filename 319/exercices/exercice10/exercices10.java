import java.util.Random;

public class exercices10 {


    public static int[] creerTableau(int taille) {
        return new int[taille];
    }

    public static int[] remplirTableauFixe(int[] tableau, int valeurFixe) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = valeurFixe;
        }
        return tableau;
    }

    public static int[] remplirTableauAleatoire(int[] tableau, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = rand.nextInt((max - min) + 1) + min;
        }
        return tableau;
    }

    public static int tailleTableau(int[] tableau) {
        return tableau.length;
    }

    public static void afficherTableau(int[] tableau) {
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }
    public static int trouverMinimum(int[] tableau) {
        int minimum = tableau[0];
        for (int valeur : tableau) {
            if (valeur < minimum) {
                minimum = valeur;
            }
        }
        return minimum;
    }

    public static int trouverMaximum(int[] tableau) {
        int maximum = tableau[0];
        for (int valeur : tableau) {
            if (valeur > maximum) {
                maximum = valeur;
            }
        }
        return maximum;
    }

    public static int compterOccurences(int[] tableau, int valeur) {
        int compteur = 0;
        for (int element : tableau) {
            if (element == valeur) {
                compteur++;
            }
        }
        return compteur;
    }

    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        return somme;
    }

    public static double calculerMoyenne(int[] tableau) {
        int somme = calculerSomme(tableau);
        return (double) somme / tableau.length;
    }

    public static int[] remplacerValeur(int[] tableau, int ancienneValeur, int nouvelleValeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == ancienneValeur) {
                tableau[i] = nouvelleValeur;
            }
        }
        return tableau;
    }
    public static int trouverPremiereOccurrence(int[] tableau, int valeur) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static int trouverDerniereOccurrence(int[] tableau, int valeur) {
        for (int i = tableau.length - 1; i >= 0; i--) {
            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Exemples d'utilisation
        int[] tableau = creerTableau(5);
        remplirTableauAleatoire(tableau, 1, 10);
        afficherTableau(tableau);

        int[] tableauFixe = creerTableau(3);
        remplirTableauFixe(tableauFixe, 42);
        afficherTableau(tableauFixe);

        System.out.println("Taille du tableau : " + tailleTableau(tableau));

        System.out.println("Minimum du tableau : " + trouverMinimum(tableau));

        System.out.println("Maximum du tableau : " + trouverMaximum(tableau));

        int valeurRecherchee = 3;
        System.out.println("Occurrences de " + valeurRecherchee + " : " + compterOccurences(tableau, valeurRecherchee));

        System.out.println("Somme des valeurs du tableau : " + calculerSomme(tableau));

        System.out.println("Moyenne des valeurs du tableau : " + calculerMoyenne(tableau));

        int ancienneValeur = 5;
        int nouvelleValeur = 99;
        remplacerValeur(tableau, ancienneValeur, nouvelleValeur);
        afficherTableau(tableau);

        int valeurRecherchee2 = 8;
        System.out.println("Première occurrence de " + valeurRecherchee2 + " : " + trouverPremiereOccurrence(tableau, valeurRecherchee2));

        System.out.println("Dernière occurrence de " + valeurRecherchee2 + " : " + trouverDerniereOccurrence(tableau, valeurRecherchee2));
    }
}