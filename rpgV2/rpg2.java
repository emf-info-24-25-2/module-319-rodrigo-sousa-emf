package rpgV2;

import java.util.Scanner;
import rpgV2.mob.Character;


public class rpg2 {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    // Si le joueur est en vie
    public static boolean alive = true;
    static Character Player = new Character(5, 100, 100, 500);

    public static void main(String[] args) throws InterruptedException {

        while (alive == true) {
            Character Luca = new Character(15, 30, 100, 50);
            Character David = new Character(5, 100, 100, 75);

            int MAXHP = Player.getHP();

            int Boost = 0;
            boolean fight = true;
            boolean shop = true;
            boolean magie = true;
            boolean boss = true;
            System.out.println("Choose what to do");
            Scanner endroit = new Scanner(System.in); // Create a Scanner object
            System.out.println(" 1 random encounter");
            System.out.println(" 2 shop");
            System.out.println(" 3 boss " + ANSI_RED + "Danger" + ANSI_RESET);
            System.out.println(" 4 magic");
            int place = endroit.nextInt(); // Read user input
            switch (place) {
                case 1:
                    System.out.println("Searching");
                    Thread.sleep(10000);
                    System.out.println("Found");
                    while (fight == true) {

                        System.out.println("Choose you'r action");
                        Scanner choix = new Scanner(System.in);
                        System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                        int output = choix.nextInt();
                        switch (output) {
                            case 1:
                                David.setHP(David.getHP() - Player.getAttack());
                                System.out.println("David " + "Attack : " + David.getAttack() + " HP : " + David.getHP());

                                break;
                            case 2:
                                if (Player.getHP() + MAXHP / 2 > MAXHP) {
                                    Player.setHP(MAXHP);

                                } else {
                                    Player.setHP(Player.getHP() + MAXHP / 2);
                                }
                                System.out.println("You have used a healing potion you now have " + Player.getHP() + "HP");
                                Thread.sleep(1000);
                                break;

                            case 3:
                                System.out.println("1 Fireball 20MP 60 Damage");
                                Thread.sleep(500);
                                System.out.println("2 Magic missile 10MP 20 Damage");
                                Thread.sleep(500);
                                System.out.println("3 Boost 50Mp 2X damage for 3 turns");
                                Thread.sleep(500);
                                System.out.println("4 Vicious Mockery 100MP 500 Damage");
                                Thread.sleep(500);
                                System.out.println("Which spell are you using");
                                Scanner magic = new Scanner(System.in); // Create a Scanner object
                                int magicChoice = magic.nextInt();
                                switch (magicChoice) {
                                    case 1:
                                        if (Boost > 0) {
                                            if (Player.getMana() - 20 >= 0) {
                                                System.out.println("You used Dai Henkai: Entei");
                                                David.setHP(David.getHP() - 120);
                                            }
                                        } else if (Player.getMana() - 20 >= 0) {
                                            System.out.println("You used Fireball");
                                            David.setHP(David.getHP() - 60);
                                        }
                                        break;
                                    case 2:
                                        if (Boost > 0) {
                                            if (Player.getMana() - 10 >= 0) {
                                                System.out.println("You used ");
                                                David.setHP(David.getHP() - 40);
                                            }
                                        } else if (Player.getMana() - 10 >= 0) {
                                            System.out.println("You used Magic Missile");
                                            David.setHP(David.getHP() - 20);
                                        }
                                        break;
                                    case 3:
                                        if (Boost > 0) {

                                            if (Player.getMana() - 50 >= 0) {
                                                System.out.println("You used Magic Boost");
                                                Boost = 3;
                                            }
                                        } else {
                                            System.out.println("Magic Boost is already activated");
                                        }
                                        break;
                                    case 4:
                                        if (Boost > 0) {
                                            if (Player.getMana() - 100 >= 0) {
                                                System.out.println("You used You'r life story");
                                                David.setHP(David.getHP() - 1000);
                                            }
                                        } else if (Player.getMana() - 100 >= 0) {
                                            System.out.println("You used Vicious Mockerie");
                                            David.setHP(David.getHP() - 500);
                                        }
                                        break;
                                    default:

                                        break;
                                }
                            case 4:
                                System.out.println("You ran away");
                                fight = false;
                                Player.setHP(MAXHP);
                                break;

                            default:
                                System.out.println("Choose an option");
                                break;

                        }
                        if (David.getHP() <= 0) {
                            System.out.println("you win" + " + " + David.getGold() + "gold");
                            Player.setGold(Player.getGold() + David.getGold());
                            System.out.println("You have " + Player.getGold() + "gold");
                            fight = false;
                            Player.setHP(MAXHP);
                            Thread.sleep(2000);
                            break;
                        } else {
                            System.out.println("David Attacked");
                            Player.setHP(Player.getHP() - David.getAttack());
                            System.out.println("You have lost " + David.getAttack() + "HP you now have " + Player.getHP() + "HP");
                            Thread.sleep(500);
                        }
                    }

                // Shop
                case 2:
                    System.out.println("1 Leather Chestplate - 1250 gold");
                    Thread.sleep(200);
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("2 Wooden Sword - 1000 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("3 Iron Chestplate - 2080 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("4 Iron Sword - 1664 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("5 Knight's Armor - 3322 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("6 Knight's Longsword - 2657 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("7 Dragonbone Mail - 5314 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("8 Dragonbone Sword - 4251 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("9 Inferno Armor - 8502 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("10 Flamebrand - 6801 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("11 Stormguard Armor - 13603 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("12 Thunderstrike - 10882 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("13 Void Armor - 21766 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("14 Shadow Reaver - 17413 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("15 Radiant Armor - 34826 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("16 Lightbringer - 27860 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("17 Astral Armor - 55721 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("18 Cosmic Edge - 44577 gold");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("19 Leave");
                    System.out.println("");
                    Thread.sleep(200);
                    System.out.println("Choose what to do ");
                    Scanner achat = new Scanner(System.in);
                    int buy = achat.nextInt();
                    while (shop == true) {

                        switch (buy) {
                            case 1:
                                if (Player.getGold() - 1250 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() + 50);
                                }
                                break;
                            case 2:
                                if (Player.getGold() - 1000 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack() + 5);
                                }
                                break;
                            case 3:
                                if (Player.getGold() - 2080 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() + 100);
                                }
                                break;
                            case 4:
                                if (Player.getGold() - 1664 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack() + 10);
                                }
                                break;
                            case 5:
                                if (Player.getGold() - 3322 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() + 125);
                                }
                                break;
                            case 6:
                                if (Player.getGold() - 2657 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack()+15);
                                }
                                break;
                            case 7:
                                if (Player.getGold() - 5314 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP()+150);
                                }
                                break;
                            case 8:
                                if (Player.getGold() - 4251 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack()+ 20);
                                }
                                break;
                            case 9:
                                if (Player.getGold() - 8502 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() + 175);
                                }
                                break;
                            case 10:
                                if (Player.getGold() - 6801 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack() +25);
                                }
                                break;
                            case 11:
                                if (Player.getGold() - 13603 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() + 200);
                                }
                                break;
                            case 12:
                                if (Player.getGold() - 10882 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack() + 30);
                                }
                                break;
                            case 13:
                                if (Player.getGold() - 21766 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() + 225);
                                }
                                break;
                            case 14:
                                if (Player.getGold() - 17413 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack()+35);
                                }
                                break;
                            case 15:
                                if (Player.getGold() - 34826 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() +  250);
                                }
                                break;
                            case 16:
                                if (Player.getGold() - 27860 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack()+40);
                                }
                                break;
                            case 17:
                                if (Player.getGold() - 55721 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setHP(Player.getHP() + 275);
                                }
                                break;
                            case 18:
                                if (Player.getGold() - 44577 < 0) {
                                    System.out.println("Too poor to buy it");
                                } else {
                                    Player.setAttack(Player.getAttack()+45);
                                }
                                break;
                            case 19:
                                System.out.println("Bye");
                                shop = false;
                                MAXHP = Player.getHP();
                                break;

                            default:
                                System.out.println("Choose an option");
                                break;
                        }
                    }
                //boss
                case 3:

                    break;
                //magie
                case 4:
                    System.out.println("Fireball 20MP 60 Damage");
                    System.out.println("Magic missile 10MP 20 Damage");
                    System.out.println("Boost 50Mp 2X damage for 3 turns");
                    System.out.println("Vicious Mockery 100MP 500 Damage");
                    break;
                default:
                    System.out.println("Choose an option");
                    break;
            }
 
        }
    }
}