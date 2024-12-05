package devoirs.devoir10;

public class pi {
    public static int NBRE_ESSAIS = 100000;
    public static void main(String[] args) {
        int compteur =0;

        for (int i = 0; i < NBRE_ESSAIS; i++) {
            double x = Math.random();
            double y = Math.random();

            double hypothenuse = Math.sqrt(x*x+y*y);

            if (hypothenuse<1) {
                compteur ++;
            }
        }
        //calcule de pi
        double estimation = 4*(double)compteur/NBRE_ESSAIS;
        System.out.println("PI = environ :" + estimation);
    }
}
