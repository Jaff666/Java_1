package bitwa;

import java.util.Scanner;

public class Arena {
    int turnCount = 0;

    public Arena(){
        System.out.println("You were attacked by a Troll!");
        System.out.println("Enemy difficulty:  Hard");
        System.out.println("Avaible weapons: Sword, Bow, Hatchet, Spear");
    }

    public void round(Player player, Enemy enemy){
        turnCount++;
        
        

        if(turnCount%2 == 1){
            int damage = enemy.damageScal("Hard");
            System.out.println("Enemy damage dealt to you: " + damage);
            player.playerHP -= (damage - player.armorValue);
            System.out.println("Your HP: " + player.playerHP);
            
        }

        if(turnCount%2 == 0){
            System.out.println("Player round. Pick your weapon: ");
            Scanner scanner = new Scanner(System.in);
            String weapon = scanner.nextLine();
            int damage = player.randomDmg(weapon);
    
            System.out.println("You dealt: "+ damage);
            enemy.enemyHP -= (damage-enemy.armorValue);
            System.out.println("Enemy HP: " + enemy.enemyHP);
        }
        if(enemy.enemyHP<0)
        {
            System.out.println("You won!");
            System.exit(0);
        }
        if(player.playerHP<0)
        {
            System.out.println("You lost!");
            System.exit(0);
        }
    }
}

 