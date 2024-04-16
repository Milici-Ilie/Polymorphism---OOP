import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ////////////////////// Difference between INHERITANCE vs COMPOSITION ///////////////////

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("NJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();

        ////////////////////// Difference between INHERITANCE vs COMPOSITION ///////////////////

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();


        ///////////////// 💊💊 [ENCAPSULATION] 💊💊 ////////////////////
        ///////////////// 💊💊  [PLAYER GAME] 💊💊 ////////////////////

        //here we have an example of how NOT to do ENCAPSULATION 🔻🔻🔻

//        Player player = new Player();
//        player.name = "Cristian";
//        player.health = 20;
//        player.weapon = "Legendary Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.restoreHealth(50);
//        System.out.println("Restoring life = " + player.health);

        EnhancedPlayer milici = new EnhancedPlayer("Ilie", 200, "Sword");
        System.out.println("Initial health is " + milici.healthRemaining());// if we check we can see that in the "EnhancedPlayer" file we changed the name for "healthPercentage", but here is only
        // "health"... this is another future of ENCAPSULATION if we don't want to expose the name of other class

        ///////////////////// PRINTER CHALLENGE /////////////////////////

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        ///////////////////// POLYMORPHISM / MOVIE 🎣🎣 [POLYMORPHISM] 🎣🎣 /////////////////////////

//        Polymorphism theMovie = new Adventure("Stars Wars");
//        Polymorphism theMovie = Polymorphism.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);// here we are created a class "s" that will take data from the Input "Scanner" that the user typed in the INPUT section "System.in" with a keyboard
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy," + "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Polymorphism movie = Polymorphism.getMovie(type, title);//🦞🦞 [CASTING-CLASSES] 🦞🦞
            movie.watchMovie();//🦞🦞 [CASTING-CLASSES] 🦞🦞
        }// this entire code will ask the user for a TYPE title and a Movie Title to display some information about it

    }

}
