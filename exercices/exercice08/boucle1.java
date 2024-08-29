package exercices.exercice08;

public class boucle1 {
    static int i = 1;
    static int y = 1;
    static int j = 1;
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Boucle for, itération "+i);
        }
    
    while (i <= 5) {
        System.out.println("Boucle while, itération "+i);
    i++;
    }
    do {
        System.out.println("Boucle do-while, itération "+y);
        y++;
    } while (y<=5);
    
    for (int i = 1; i <= 5; i++) {
        if (i != 3) {
        System.out.println("Boucle for, itération "+i);
        }
    }

    while (j <= 5) {
        System.out.println("Boucle while, itération "+j);
   
        if (j == 3) {
            break;
        }   
          j++;
   
    }
    
    }

}
