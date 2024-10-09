package devoirs.devoir04 ;

public class devoir04 {

    public static void main(String[] args) {
        int year = 2024;
        int mois = 2;
        int jour = 29;
        int bisextil = year % 4;
        System.out.println("La date entrés est le " + jour + "." + mois+ "." + year);
        if (year<=9999 || year >= 0) {
            
         
        switch (mois) {
            case 1:
              
                if (jour <= 31) {
                    System.out.println("la date formatée est le " + jour + "janviers" + year);
                }
                if (jour >= 32) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }

                break;

            case 2:
                
                if (jour <= 29) {
                    if (jour == 29 && bisextil == 0) {
                        System.out.println("la date formatée est le " + jour + " Février " + year);
                        break;
                    }
                    if (jour <= 28) {
                        System.out.println("la date formatée est le " + jour + " Février " + year);
                    }

                }
                if (jour == 29 && bisextil != 0) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }

                if (jour > 29) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }

                break;
            case 3:
                
                if (jour <= 31) {
                    System.out.println("la date formatée est le " + jour + "Mars" + year);
                }
                if (jour >= 32) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 4:
                
                if (jour <= 30) {
                    System.out.println("la date formatée est le " + jour + "Avril" + year);
                }
                if (jour >= 31) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 5:
                
                if (jour <= 31) {
                    System.out.println("la date formatée est le " + jour + "Mai" + year);
                }
                if (jour >= 32) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 6:
                
                if (jour <= 30) {
                    System.out.println("la date formatée est le " + jour + "Juin" + year);
                }
                if (jour >= 31) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 7:
                
                if (jour <= 31) {
                    System.out.println("la date formatée est le " + jour + "Juillet" + year);
                }
                if (jour >= 32) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 8:
                
                if (jour <= 31) {
                    System.out.println("la date formatée est le " + jour + "Août" + year);
                }
                if (jour >= 32) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 9:
                
                if (jour <= 30) {
                    System.out.println("la date formatée est le " + jour + "Septembre" + year);
                }
                if (jour >= 31) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 10:
                
                if (jour <= 31) {
                    System.out.println("la date formatée est le " + jour + "Octobre" + year);
                }
                if (jour >= 32) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 11:
                
                if (jour <= 30) {
                    System.out.println("la date formatée est le " + jour + "Novembre" + year);
                }
                if (jour >= 31) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
            case 12:
                
                if (jour <= 31) {
                    System.out.println("la date formatée est le " + jour + "Decembre" + year);
                }
                if (jour >= 32) {
                    System.out.println("le jour " + "[" + jour + "]" + "est hors limite");
                }
                break;
        }
    }else{
        System.out.println("L'année "+"["+year+"]"+" est hors limites !");
    }

    }

}
