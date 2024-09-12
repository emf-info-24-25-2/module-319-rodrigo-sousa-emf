package formative;

public class formative {
static int TEMPS_MIN=35;
static int TEMPS_MAX =75;
public static int[] generertemps(){
   
    int[] tabtemps = new int[8]; 
    for (int i = 0; i < tabtemps.length; i++) {
            tabtemps[i] = (int) ( Math.random() * ( TEMPS_MAX - TEMPS_MIN + 1) ) + TEMPS_MIN;
            System.out.println(tabtemps[i]);
           
    }
    return tabtemps;
};
public static void positionMeilleurTemps(){
  int[] tableau = generertemps();
int valeurMaximale = 75; 
    for (int i = 0; i < tableau.length; i++) {
        if (tableau[i] < valeurMaximale) {
            valeurMaximale = tableau[i];
        }
        System.out.println(valeurMaximale);
    }
};
public static void calculQualification(){


    


};
    String[] participant = {"Kilian", "Max"," Noé "," Beat ","André "," Alex" ," John "," Fred" };
         
public static void main(String[] args) {
    generertemps();
    positionMeilleurTemps();
}


}
