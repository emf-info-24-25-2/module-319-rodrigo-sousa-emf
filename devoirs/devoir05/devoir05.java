package devoirs.devoir05;

 

import java.util.Scanner;
 
 

public class devoir05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 100) + 1;

        int guess = 0;

        int numGuesses = 0;

        while (guess != number) {

            System.out.print("Devinez le nombre entre 1 et 100: ");

            guess = input.nextInt();

            numGuesses++;

 

            if (guess < number) {

                System.out.println("Trop petit!");

            } else if (guess > number) {

                System.out.println("Trop grand!");

            } else {

                System.out.println("Bravo, trouvé!");

                System.out.println("Nombre de tentatives: " + numGuesses);

            }

        }

   

}

 
}