package bitwa;

public class Enemy {
    int armorValue;
    int basicDmg;
    int enemyHP;
    String enemyDifficulty;



    public void Ork(String enemyDifficulty){
        this.enemyHP=1000;
        this.basicDmg=15;
        this.armorValue=10;
        this.enemyDifficulty=enemyDifficulty;
    }

    public void Troll(String enemyDifficulty){
        this.enemyHP=1500;
        this.basicDmg=20;
        this.armorValue=15;
        this.enemyDifficulty=enemyDifficulty;
    }

    public void Golem(String enemyDifficulty){
        this.enemyHP=2000;
        this.basicDmg=25;
        this.armorValue=20;
        this.enemyDifficulty=enemyDifficulty;
    }

    public void Dragon(String enemyDifficulty){
        this.enemyHP=2500;
        this.basicDmg=30;
        this.armorValue=25;
        this.enemyDifficulty=enemyDifficulty;
    }

    public int damageScal(String enemyDifficulty){
        int damage = 0;
        basicDmg = (int) Math.random() * basicDmg + basicDmg + basicDmg * (int) Math.random();
        switch(enemyDifficulty){
            case "Low":
                damage = basicDmg * 10;
                break;
            case "Medium": 
                damage = basicDmg * 20;
                break;
            case "Hard":
                damage = basicDmg * 30;
                break;

        }
        return damage;
    }
}
    


