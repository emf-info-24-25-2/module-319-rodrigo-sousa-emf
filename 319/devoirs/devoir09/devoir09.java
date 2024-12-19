package devoirs.devoir09;

import java.util.Arrays;
 
public class devoir09 {

    public final static int NBRE_CHIFFRES = 6;
    public final static int MIN = 0; 
    public final static int MAX = 10; 

    public static int[] genereTirage(int NBR_tirage, int min, int max) {

        if (max - min + 1 < NBR_tirage) {
            throw new IllegalArgumentException("La plage des valeurs est trop petite pour générer " +
                    NBR_tirage + " valeurs uniques.");
        } 

        int[] tab = new int[NBR_tirage];
        int index = 0;

        while (index < NBR_tirage) {
            int randomValue = (int) (Math.random() * (max - min + 1)) + min;
            
            boolean exists = false;
            for (int i = 0; i < index; i++) {
                if (tab[i] == randomValue) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                tab[index] = randomValue;
                index++;
            }
        }

        return tab;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(genereTirage(NBRE_CHIFFRES, MIN, MAX)));
    }
}
