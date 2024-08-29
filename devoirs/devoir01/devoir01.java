package devoirs.devoir01;

public class devoir01 {
    public static void main(String[] args) {
        int monAge = 30;
        boolean estMajeur;

        if (monAge >= 20) {
            estMajeur = true;
            
        }else {estMajeur = false;}

        System.out.println("Je m'appelle BERNASCONI Maria");
   System.out.println("Mon Age est de : " + monAge + " ans");
        if (estMajeur == true) {
            System.out.println("Je suis majeur");
        } else{ System.out.println("Je ne suis pas encore majeur");}
}
}
