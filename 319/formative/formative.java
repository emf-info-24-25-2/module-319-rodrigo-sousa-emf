package formative;

public class formative {
//il faudrait ajouter public avant static, et également final puisqu'on vous demande des constantes pt 2
static int TEMPS_MIN=35;
static int TEMPS_MAX =75;

//la méthode genererTemps doit prendre la taille du tableau a créer en paramètre pt 3
public static int[] generertemps(){
   
    int[] tabtemps = new int[8]; //la taille devrait dépendre du paramètre reçu
    for (int i = 0; i < tabtemps.length; i++) {
            tabtemps[i] = (int) ( Math.random() * ( TEMPS_MAX - TEMPS_MIN + 1) ) + TEMPS_MIN;
            System.out.println(tabtemps[i]);
           
    }
    return tabtemps;
};

//la méthode positionMeilleurTemps ne doit pas retourner void, mais l'index du meilleur temps, donc un int pt 4
//de plus, elle doit prendre le tableau a évaluer en paramètre, pas le créer
   public static void positionMeilleurTemps(){
  int[] tableau = generertemps(); //ici il ne faut pas créer le tableau
int valeurMaximale = 75; //utilisez la constante ici
    for (int i = 0; i < tableau.length; i++) {
        if (tableau[i] < valeurMaximale) {
            valeurMaximale = tableau[i];
        }
        System.out.println(valeurMaximale);
    }
};

//ici aussi, corrigez les paramètres et la valeur de retour
public static void calculQualification(){


    


};

   //cette variable doit s'appeler "riders" et non pas "participants". elle doit etre déclarée dans le main pt6.1
    String[] participant = {"Kilian", "Max"," Noé "," Beat ","André "," Alex" ," John "," Fred" };
         
public static void main(String[] args) {
   //à compléter. suivez la donnée ligne par ligne!
    generertemps();
    positionMeilleurTemps();
}


}
