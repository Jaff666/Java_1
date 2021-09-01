
import bitwa.Player;
import bitwa.Enemy;
import bitwa.Arena;

public class GameMain {
    public static void main(String[] args) 
    {
    
        Player player1 = new Player(2000,10,30,"Hatchet");
        Enemy enemy1 = new Enemy();
        enemy1.Troll("Hard");
        Arena fightArena = new Arena();
    
        while(true){
            fightArena.round(player1,enemy1);
        }
    }
}
