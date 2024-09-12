import java.util.Scanner;
public class yu_gi_o {
   
  

  int hp;
  int mana;
  int attack;
  void player(int hp, int mana, int attack){
    this.attack = 4;
    this.hp = 100;
    this.mana = 100;
  }
  
   void luca(int hp, int mana, int attack){
    this.attack = 5;
    this.hp = 20;
    this.mana = 100;
  }
  void melvin(int hp, int mana, int attack){
    this.attack = 8;
    this.hp = 30;
    this.mana = 100;
  }
  void david(int hp, int mana, int attack){
    this.attack = 1;
    this.hp = 200;
    this.mana = 100;
  }
  final void bartosz(int hp, int mana, int attack){
    this.attack = 4;
    this.hp = 100;
    this.mana = 100;
  }

public static void main(String[] args) {
    System.out.println("Choose you'r action");
    Scanner choix = new Scanner(System.in);  // Create a Scanner object
    System.out.println(" 1 attack, 2 heal, 3 run");
    String output = choix.nextLine();  // Read user input
    System.out.println(david);
while (true) {
    

   if (output =="1") {
   
    }else if (output =="2") {
        
    }else if (output == "3") {
        
    }else{
        System.out.println("Choose an option");
    }
}
}
}
