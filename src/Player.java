public class Player {

    //💊💊 [ENCAPSULATION] 💊💊
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {

        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game!");
        }//checking the life of the player
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth){
        health = health + extraHealth;//if the player finds out a wat to restore his life
        if(health >100){
            System.out.println("Player restored to 100%");
            health = 100;
        }//maximum life will be 100
    }
}
