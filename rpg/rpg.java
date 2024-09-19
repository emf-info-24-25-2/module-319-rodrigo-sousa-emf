import java.io.Console;
import java.util.Scanner;

public class rpg {
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";

  int hp;
  int mana;
  int attack;
  // attack,hp,mana,gold
  public static int[] player = new int[] { 400, 100, 100, 500 };

  public void luca() {
    this.attack = 5;
    this.hp = 20;
    this.mana = 100;
  }

  public void melvin() {
    this.attack = 8;
    this.hp = 30;
    this.mana = 100;
  }

  // attack,hp,mana,gold lootable
  public static int[] david = new int[] { 1, 200, 100, 200 };

  public void bartosz() {
    this.attack = 4;
    this.hp = 1;
    this.mana = 100;
  }

  public static void main(String[] args) {
    System.out.println("David " + "Attack : " + david[0] + " HP : " + david[1]);
    System.out.println("");

    while (true) {
      System.out.println("Choose what to do");
      Scanner endroit = new Scanner(System.in); // Create a Scanner object
      System.out.println(" 1 random encounter");
      System.out.println(" 2 shop");
      System.out.println(" 3 boss " +ANSI_RED + "Danger" + ANSI_RESET );
      System.out.println(" 4 magic");
      int place = endroit.nextInt(); // Read user input
      switch (place) {
        case 1:
          System.out.println("Choose you'r action");
          Scanner choix = new Scanner(System.in); // Create a Scanner object
          System.out.println(" 1 attack, 2 heal, 3 run");
          int output = choix.nextInt(); // Read user input
          switch (output) {
            case 1:
              david[1] = david[1] - player[0];
              System.out.println("David " + "Attack : " + david[0] + " HP : " + david[1]);

              break;
            case 2:


              break;

            case 3:

              break;

            default:
              System.out.println("Choose an option");
              break;

          }
          if (david[1] <= 0) {
            System.out.println("you win" + " + " + david[3] + "gold");
            player[3] = player[3] + david[3];
            System.out.println("You have " + player[3] + "gold");
            break;
          }
          break;
case 2:
System.out.println(" Armure en cuir ");
System.out.println(" épeé en bois");
System.out.println(" Armure en fer");
System.out.println(" épeé en fer");
System.out.println(" Steel Broadsword");
System.out.println(" Steel Plate Armor");
System.out.println(" Knight's Longsword");
System.out.println(" Knight's Armor");
System.out.println(" Dragonbone Sword");
System.out.println(" Dragonbone Mail");
System.out.println(" Rune Blade");
System.out.println(" Enchanted Plate");
System.out.println(" Flamebrand");
System.out.println(" Inferno Armor");
System.out.println(" Frostfang");
System.out.println(" Icebound Armor");
System.out.println(" Thunderstrike");
System.out.println(" Stormguard Armor");
System.out.println(" Celestial Blade");
System.out.println(" Divine Armor");
System.out.println(" Shadow Reaver");
System.out.println(" Void Armor");
System.out.println(" Lightbringer");
System.out.println(" Radiant Armor");
System.out.println(" Cosmic Edge");
System.out.println(" Astral Armor");
break;
        default:
        System.out.println("Choose an option");
          break;
      }

    }
  }
}
