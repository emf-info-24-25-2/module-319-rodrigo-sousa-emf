
import java.util.Scanner;

public class rpg {

    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    // attack,hp,mana,gold
    public static int[] player = new int[]{4, 100, 100, 500000};
    // attack,hp,mana,gold lootable
    public static int[] luca = new int[]{10, 100, 100, 200};
    // attack,hp,mana,gold lootable
    public static int[] melvin = new int[]{16, 300, 100, 350};
    // attack,hp,mana,gold lootable
    public static int[] david = new int[]{2, 400, 100, 300};
    // attack,hp,mana,gold lootable
    public static int[] bartosz = new int[]{8, 60, 100, 150};
    //boss numéro 1
    public static int[] Aizen = new int[]{150, 750, 100, 1500};
    // deuxiéme boss
    public static int[] Ywatch = new int[]{150, 1000, 100, 4500};
    // boss 3
    public static int[] Alexnight = new int[]{170, 2500, 100, 10000};
    // boss final
    public static int[] Noxx = new int[]{250, 5000, 100, 5000};
    // Si le joueur est en vie
    public static boolean alive = true;
    public static boolean win = false;

    public static int MAXHP = player[1];
    public static int Boost = 0;

    public static boolean fight = true;
    public static boolean shop = true;

    public static void encounter(int[] player) throws InterruptedException {

        System.out.println("Searching");
        Thread.sleep(10000);
        System.out.println("Found");
        int mob = (int) (Math.random() * (4 - 1 + 1)) + 1;
        switch (mob) {
            case 1:

                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            david[1] = david[1] - player[0];
                            System.out.println("David " + "Attack : " + david[0] + " HP : " + david[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            david[1] = david[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        david[1] = david[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 10 >= 0) {
                                            System.out.println("You used Hadoken");
                                            david[1] = david[1] - 40;
                                        }
                                    } else if (player[2] - 10 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        david[1] = david[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 50 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            david[1] = david[1] - 1000;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        david[1] = david[1] - 500;
                                    }
                                    break;
                                default:

                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (david[1] <= 0) {
                        System.out.println("you win" + " + " + david[3] + "gold");
                        player[3] = player[3] + david[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("David Attacked");
                        player[1] = player[1] - david[0];
                        System.out.println("You have lost " + david[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }
                break;
            case 2:
                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            luca[1] = luca[1] - player[0];
                            System.out.println("Luca " + "Attack : " + luca[0] + " HP : " + luca[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            luca[1] = luca[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        luca[1] = luca[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 10 >= 0) {
                                            System.out.println("You used Hadoken");
                                            luca[1] = luca[1] - 40;
                                        }
                                    } else if (player[2] - 10 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        luca[1] = luca[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            luca[1] = luca[1] - 1000;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        luca[1] = luca[1] - 500;
                                    }
                                    break;
                                default:

                                    break;
                            }
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (luca[1] <= 0) {
                        System.out.println("you win" + " + " + luca[3] + "gold");
                        player[3] = player[3] + luca[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("Luca Attacked");
                        player[1] = player[1] - luca[0];
                        System.out.println("You have lost " + luca[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }
                break;
            case 3:
                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            bartosz[1] = bartosz[1] - player[0];
                            System.out.println("Bartosz " + "Attack : " + bartosz[0] + " HP : " + bartosz[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            bartosz[1] = bartosz[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        bartosz[1] = bartosz[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Hadoken");
                                            bartosz[1] = bartosz[1] - 40;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        bartosz[1] = bartosz[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            bartosz[1] = bartosz[1] - 40;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        bartosz[1] = bartosz[1] - 20;
                                    }
                                    break;
                                default:

                                    break;
                            }
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (bartosz[1] <= 0) {
                        System.out.println("you win" + " + " + bartosz[3] + "gold");
                        player[3] = player[3] + bartosz[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("bartosz Attacked");
                        player[1] = player[1] - bartosz[0];
                        System.out.println("You have lost " + bartosz[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }
                break;

            case 4:
                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            melvin[1] = melvin[1] - player[0];
                            System.out.println("melvin " + "Attack : " + melvin[0] + " HP : " + melvin[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            melvin[1] = melvin[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        melvin[1] = melvin[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Hadoken");
                                            melvin[1] = melvin[1] - 40;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        melvin[1] = melvin[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            melvin[1] = melvin[1] - 1000;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        melvin[1] = melvin[1] - 500;
                                    }
                                    break;
                                default:

                                    break;
                            }
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (melvin[1] <= 0) {
                        System.out.println("you win" + " + " + melvin[3] + "gold");
                        player[3] = player[3] + melvin[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("melvin Attacked");
                        player[1] = player[1] - melvin[0];
                        System.out.println("You have lost " + melvin[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }
                break;
        }
        // Shop

    }

    public static void ShowShop() throws InterruptedException {
        String[] items = {
            "1 Leather Chestplate - 1250 gold",
            "2 Wooden Sword - 1000 gold",
            "3 Iron Chestplate - 2080 gold",
            "4 Iron Sword - 1664 gold",
            "5 Knight's Armor - 3322 gold",
            "6 Knight's Longsword - 2657 gold",
            "7 Dragonbone Mail - 5314 gold",
            "8 Dragonbone Sword - 4251 gold",
            "9 Inferno Armor - 8502 gold",
            "10 Flamebrand - 6801 gold",
            "11 Stormguard Armor - 13603 gold",
            "12 Thunderstrike - 10882 gold",
            "13 Void Armor - 21766 gold",
            "14 Shadow Reaver - 17413 gold",
            "15 Radiant Armor - 34826 gold",
            "16 Lightbringer - 27860 gold",
            "17 Astral Armor - 55721 gold",
            "18 Cosmic Edge - 44577 gold",
            "19 Leave"
        };
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
            System.out.println("");
            Thread.sleep(200);
        }
    }

    public static int[] shop(int[] player) throws InterruptedException {
        while (shop == true) {
            Thread.sleep(200);
            System.out.println("Choose what to do ");
            Scanner achat = new Scanner(System.in);

            int buy = achat.nextInt();

            switch (buy) {
                case 1:
                    if (player[3] - 1250 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 50;
                    }
                    break;
                case 2:
                    if (player[3] - 1000 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 5;
                    }
                    break;
                case 3:
                    if (player[3] - 2080 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 100;
                    }
                    break;
                case 4:
                    if (player[3] - 1664 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 10;
                    }
                    break;
                case 5:
                    if (player[3] - 3322 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 125;
                    }
                    break;
                case 6:
                    if (player[3] - 2657 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 15;
                    }
                    break;
                case 7:
                    if (player[3] - 5314 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 150;
                    }
                    break;
                case 8:
                    if (player[3] - 4251 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 20;
                    }
                    break;
                case 9:
                    if (player[3] - 8502 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 175;
                    }
                    break;
                case 10:
                    if (player[3] - 6801 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 25;
                    }
                    break;
                case 11:
                    if (player[3] - 13603 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 200;
                    }
                    break;
                case 12:
                    if (player[3] - 10882 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 30;
                    }
                    break;
                case 13:
                    if (player[3] - 21766 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 225;
                    }
                    break;
                case 14:
                    if (player[3] - 17413 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 35;
                    }
                    break;
                case 15:
                    if (player[3] - 34826 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 250;
                    }
                    break;
                case 16:
                    if (player[3] - 27860 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 40;
                    }
                    break;
                case 17:
                    if (player[3] - 55721 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[1] = player[1] + 275;
                    }
                    break;
                case 18:
                    if (player[3] - 44577 < 0) {
                        System.out.println("Too poor to buy it");
                    } else {
                        player[0] = player[0] + 45;
                    }
                    break;
                case 19:
                    System.out.println("Bye");
                    shop = false;
                    MAXHP = player[1];
                    break;

                default:
                    System.out.println("Choose an option");
                    break;
            }
        }

        return player;
    }

    public static void stat(int[] player) throws InterruptedException {
        System.out.println("Attack : " + player[0]);
        Thread.sleep(500);
        System.out.println("HP : " + player[1]);
        Thread.sleep(500);
        System.out.println("Mana : " + player[2]);
        Thread.sleep(500);
        System.out.println("Gold : " + player[3]);
        Thread.sleep(500);
        System.out.println("");

    }

    public static void boss(int[] player) throws InterruptedException {

        System.out.println("Choose which boss to fight 1 first boss , 2 second boss , 3 third boss , 4 Final boss");
        Scanner choose_one = new Scanner(System.in);
        int choose_boss = choose_one.nextInt();
        switch (choose_boss) {
            case 1:
                System.out.println("");
                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            Aizen[1] = Aizen[1] - player[0];
                            System.out.println("Aizen " + "Attack : " + Aizen[0] + " HP : " + Aizen[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            Aizen[1] = Aizen[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        Aizen[1] = Aizen[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 10 >= 0) {
                                            System.out.println("You used Hadoken");
                                            Aizen[1] = Aizen[1] - 40;
                                        }
                                    } else if (player[2] - 10 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        Aizen[1] = Aizen[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 50 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            Aizen[1] = Aizen[1] - 1000;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        Aizen[1] = Aizen[1] - 500;
                                    }
                                    break;
                                default:

                                    break;
                            }
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (Aizen[1] <= 0) {
                        System.out.println("you win" + " + " + Aizen[3] + "gold");
                        player[3] = player[3] + Aizen[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("Aizen Attacked");
                        player[1] = player[1] - Aizen[0];
                        System.out.println("You have lost " + Aizen[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }
                break;
            case 2:
                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            Ywatch[1] = Ywatch[1] - player[0];
                            System.out.println("Ywatch " + "Attack : " + Ywatch[0] + " HP : " + Ywatch[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            Ywatch[1] = Ywatch[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        Ywatch[1] = Ywatch[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 10 >= 0) {
                                            System.out.println("You used Hadoken");
                                            Ywatch[1] = Ywatch[1] - 40;
                                        }
                                    } else if (player[2] - 10 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        Ywatch[1] = Ywatch[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 50 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            Ywatch[1] = Ywatch[1] - 1000;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        Ywatch[1] = Ywatch[1] - 500;
                                    }
                                    break;
                                default:

                                    break;
                            }
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (Ywatch[1] <= 0) {
                        System.out.println("you win" + " + " + Ywatch[3] + "gold");
                        player[3] = player[3] + Ywatch[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("Ywatch Attacked");
                        player[1] = player[1] - Ywatch[0];
                        System.out.println("You have lost " + Ywatch[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }

                break;
            case 3:
                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            Alexnight[1] = Alexnight[1] - player[0];
                            System.out.println("Alexnight " + "Attack : " + Alexnight[0] + " HP : " + Alexnight[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            Alexnight[1] = Alexnight[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        Alexnight[1] = Alexnight[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 10 >= 0) {
                                            System.out.println("You used Hadoken");
                                            Alexnight[1] = Alexnight[1] - 40;
                                        }
                                    } else if (player[2] - 10 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        Alexnight[1] = Alexnight[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 50 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            Alexnight[1] = Alexnight[1] - 1000;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        Alexnight[1] = Alexnight[1] - 500;
                                    }
                                    break;
                                default:

                                    break;
                            }
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (Alexnight[1] <= 0) {
                        System.out.println("you win" + " + " + Alexnight[3] + "gold");
                        player[3] = player[3] + Alexnight[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("Alexnight Attacked");
                        player[1] = player[1] - Alexnight[0];
                        System.out.println("You have lost " + Alexnight[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }

                break;
            case 4:
                while (fight == true) {

                    System.out.println("Choose you'r action");
                    Scanner choix = new Scanner(System.in);
                    System.out.println(" 1 attack, 2 heal, 3 magic, 4 run");
                    int output = choix.nextInt();
                    switch (output) {
                        case 1:
                            Noxx[1] = Noxx[1] - player[0];
                            System.out.println("Noxx " + "Attack : " + Noxx[0] + " HP : " + Noxx[1]);

                            break;
                        case 2:
                            if (player[1] + MAXHP / 2 > MAXHP) {
                                player[1] = MAXHP;

                            } else {
                                player[1] = player[1] + MAXHP / 2;
                            }
                            System.out.println("You have used a healing potion you now have " + player[1] + "HP");
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
                                        if (player[2] - 20 >= 0) {
                                            System.out.println("You used Dai Henkai: Entei");
                                            Noxx[1] = Noxx[1] - 120;
                                        }
                                    } else if (player[2] - 20 >= 0) {
                                        System.out.println("You used Fireball");
                                        Noxx[1] = Noxx[1] - 60;
                                    }
                                    break;
                                case 2:
                                    if (Boost > 0) {
                                        if (player[2] - 10 >= 0) {
                                            System.out.println("You used Hadoken");
                                            Noxx[1] = Noxx[1] - 40;
                                        }
                                    } else if (player[2] - 10 >= 0) {
                                        System.out.println("You used Magic Missile");
                                        Noxx[1] = Noxx[1] - 20;
                                    }
                                    break;
                                case 3:
                                    if (Boost > 0) {

                                        if (player[2] - 50 >= 0) {
                                            System.out.println("You used Boost");
                                            Boost = 3;
                                        }
                                    }
                                    break;
                                case 4:
                                    if (Boost > 0) {
                                        if (player[2] - 100 >= 0) {
                                            System.out.println("You used You'r life story");
                                            Noxx[1] = Noxx[1] - 1000;
                                        }
                                    } else if (player[2] - 100 >= 0) {
                                        System.out.println("You used Vicious Mockerie");
                                        Noxx[1] = Noxx[1] - 500;
                                    }
                                    break;
                                default:

                                    break;
                            }
                        case 4:
                            System.out.println("You ran away");
                            fight = false;
                            player[1] = MAXHP;
                            break;

                        default:
                            System.out.println("Choose an option");
                            break;

                    }
                    if (Noxx[1] <= 0) {
                        System.out.println("you win" + " + " + Noxx[3] + "gold");
                        player[3] = player[3] + Noxx[3];
                        System.out.println("You have " + player[3] + "gold");
                        fight = false;
                        alive = false;
                        win = true;
                        player[1] = MAXHP;
                        Thread.sleep(2000);
                        break;
                    } else {
                        System.out.println("Noxx Attacked");
                        player[1] = player[1] - Noxx[0];
                        System.out.println("You have lost " + Noxx[0] + "HP you now have " + player[1] + "HP");
                        Thread.sleep(500);
                    }
                }

                break;
            default:
                System.out.println("Choose an option");

        }

        //magie
    }

    public static void magic() throws InterruptedException {

        System.out.println("Fireball 20MP 60 Damage");
        Thread.sleep(500);
        System.out.println("Magic missile 10MP 20 Damage");
        Thread.sleep(500);
        System.out.println("Boost 50Mp 2X damage for 3 turns");
        Thread.sleep(500);
        System.out.println("Vicious Mockery 100MP 500 Damage");
        Thread.sleep(500);
        System.out.println("");

    }

    public static void main(String[] args) throws InterruptedException {
        while (alive == true) {
            MAXHP = player[1];
            Boost = 0;
            fight = true;
            shop = true;

            System.out.println("Choose what to do");
            Scanner endroit = new Scanner(System.in); // Create a Scanner object
            System.out.println(" 1 random encounter");
            Thread.sleep(500);
            System.out.println(" 2 shop");
            Thread.sleep(500);
            System.out.println(" 3 boss " + ANSI_RED + "Danger" + ANSI_RESET);
            Thread.sleep(500);
            System.out.println(" 4 magic");
            Thread.sleep(500);
            System.out.println(" 5 Stats");
            int place = endroit.nextInt(); // Read user input
            switch (place) {
                case 1:
                    encounter(player);
                    break;
                case 2:
                    ShowShop();
                    shop(player);
                    break;
                case 3:
                    boss(player);
                    break;
                case 4:
                    magic();
                    break;
                case 5:
                    stat(player);
                    break;
                default:
                    System.out.println("Choose an option");
                    break;
            }

        }
        if (win == true) {
            System.out.println(ANSI_GREEN + "You won the game GG" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "You lost big skill issue" + ANSI_RESET);
        }
    }
}
