package bitwa;

import java.util.Scanner;

public class Player {
    int armorValue;
    int basicDmg;
    int playerHP;
    String weapon;

public Player(int playerHP, int armorValue, int basicDmg, String weapon){
            this.playerHP = playerHP;
            this.basicDmg = basicDmg;
            this.armorValue = armorValue;
            this.weapon = weapon;
        }
    
public int randomDmg(String weapon){
            int damage = 0;
            basicDmg = (int) Math.random() * basicDmg + basicDmg + basicDmg * (int) Math.random();
            switch(weapon){
                case "Bow":
                    damage = basicDmg * 10;
                    break;
                case "Hatchet": 
                    damage = basicDmg * 20;
                    break;
                case "Spear":
                    damage = basicDmg * 30;
                    break;
                case "Sword":
                    damage = basicDmg * 40;
                    break;

            }
            return damage;
        }
}