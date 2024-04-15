public class EnhancedPlayer {
    //💊💊 [ENCAPSULATION] 💊💊
    //this is the good method of ENCAPSULATION

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Wood sword");
    }//this is how we ensure that every time when we create a new player we will set the "name", health auto and also the sword

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;

        if (health < 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }

        this.weapon = weapon;
    }//CONSTRUCTOR

    public void loseHealth(int damage) {

        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game!");
        }//checking the life of the player
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;//if the player finds out a wat to restore his life
        if(healthPercentage >100){
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }//maximum life will be 100
    }
}
