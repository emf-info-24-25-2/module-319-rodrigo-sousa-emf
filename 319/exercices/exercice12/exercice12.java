package exercices.exercice12;

public class exercice12 {

    public static void main(String[] args) {
        
String maChaineDeCaractere = "Voici du contenu stocké dans un String.";

System.out.println("Nombre de caractères contenu dans la variable maChaineDeCaractere : "+maChaineDeCaractere.length());

System.out.println("Le mot \"contenu\" commence à la position :" + maChaineDeCaractere.indexOf("contenu"));

System.out.println("Le position 17 contient la lettre : " + maChaineDeCaractere.charAt(17));

String monPrenom = "Rodrigo";
for (int i = 0; i < monPrenom.length(); i++) {
    System.out.println(monPrenom.charAt(i));
}
if (monPrenom.contains("test")) {
    System.out.println("La chaîne de caractère \"Rodrigo\" contient le texte \"test\".");
} else{
    System.out.println("La chaîne de caractère \"Rodrigo\" ne contient pas le texte \"test\".");
}
}
}

