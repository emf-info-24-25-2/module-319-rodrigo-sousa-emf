public class devoir02 {
    public static void main( String [] args ) {
    int ReservoireA = 0;
     int ReservoireB = 0;
      int capacite_Reservoire_A = 3;
      int capacite_Reservoire_B = 5;
      int reservoir = capacite_Reservoire_A + capacite_Reservoire_B ;
      System.out.println("Il y a " + reservoir + " litres à remplir");
      
     while (ReservoireA< 3){
     ReservoireA++;

      
      System.out.println("Le réservoir A : " + ReservoireA + "Le réservoir B : " + ReservoireB);
    }
     while ( ReservoireA + ReservoireB < reservoir);{
     ReservoireB++;
     System.out.println("Le réservoir A : " + ReservoireA + "Le réservoir B : " + ReservoireB);
     }

System.out.println("Remplissage terminé!");














    
    }







    }