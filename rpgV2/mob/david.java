package rpgV2.mob;

public class david {
    private int attack;
    private int HP; 
    private int mana; 
    private int gold;
    public void david(int attack, int HP, int mana, int gold){
        this.attack = 1;
        this.HP = 200;
        this.mana = 100;
        this.gold = 75;

    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getHP() {
        return HP;
    }
    public void setHP(int hP) {
        HP = hP;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }
    
}
