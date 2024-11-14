package devoirs.devoir07;

public class devoir07 {
public static int TAILLE_TABLEAU = 10;
public static int MIN_NOMBRE = -8;
public static int MAX_NOMBRE = 8;
public static int VALEUR_RECHERCHE = 7;

public static int[] genererValeursAleatoires(int nbr,int nbr_min, int nbr_max){
    int[] tableau = new int[nbr];
    for (int i = 0; i < tableau.length; i++) {
        tableau[i] = (int) ( Math.random() * ( nbr_max - nbr_min + 1) ) + nbr_min;
    }
    return tableau;
}
public static int positionValeur(int[] tableau, int valeur){
int valeur_trouver = -1;
for (int i = 0; i < tableau.length; i++) {
    if (tableau[i] == valeur) {
        valeur_trouver =i;
    }
}
    return valeur_trouver;
}
public static void main(String[] args) {
    int[] tab = new int[TAILLE_TABLEAU];
    System.out.println("Le tableau d'entiers généré contient : "+ TAILLE_TABLEAU + " valeurs");
    tab = genererValeursAleatoires(TAILLE_TABLEAU, MIN_NOMBRE, MAX_NOMBRE);
    System.out.println( "Les deux premières/dernières valeurs sont : [" + tab[0]+"]["+tab[1]+"] ... ["+tab[8]+"]["+tab[9]+"]");
    System.out.println("La valeur " + VALEUR_RECHERCHE + " figure à la position N°" + positionValeur(tab, VALEUR_RECHERCHE) + " du tableau !");
    System.out.println( "Voici le contenu du tableau :");
    
    
    for (int i = 0; i < tab.length; i++) {
        System.out.println("Tableau["+i+"] = " + tab[i]);
    }
}
    
}
