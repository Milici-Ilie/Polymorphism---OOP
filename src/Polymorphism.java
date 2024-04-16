public class Polymorphism {
    //this will represent our "Movie" class 🎣🎣 [POLYMORPHISM] 🎣🎣 🎣🎣 [POLYMORPHISM] 🎣🎣

    private String title;

    public Polymorphism(String title) {
        this.title = title;
    }//constructor

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();// will inherit the name of the class, in our case is "Polymorphism"
        System.out.println(title + " is a " + instanceType + " film");//Metoda getClass() este furnizată implicit de către clasa Object, din care toate celelalte clase sunt derivate în Java. Această metodă returnează obiectul Class asociat cu instanța curentă a obiectului și oferă informații despre clasă, cum ar fi numele clasei, metodele, câmpurile etc.
        //Metoda getSimpleName() face parte din clasa Class și este folosită pentru a obține numele simplu al clasei. Numele simplu este numele clasei fără pachetul său. Ambele metode sunt incluse
        // în Java și sunt disponibile pentru toate clasele.
    }

    public static Polymorphism getMovie(String type, String title) {

        return switch (type.toUpperCase().charAt(0)) {//here we are making the characters uppercase, and then we check the first letter (0), this is how we will know which category was selected
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Polymorphism(title);
        };//🎣🎣 [POLYMORPHISM] 🎣🎣
    }
}

class Adventure extends Polymorphism {
    public Adventure(String title) {
        super(title);
    }//constructor

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }// here we override the original method with our attributes, and the original method remain the same and ready to be used in another place/method
}

class Comedy extends Polymorphism {
    public Comedy(String title) {
        super(title);
    }//constructor

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }// here we override the original method with our attributes, and the original method remain the same and ready to be used in another place/method
}

class ScienceFiction extends Polymorphism {
    public ScienceFiction(String title) {
        super(title);
    }//constructor

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }// here we override the original method with our attributes, and the original method remain the same and ready to be used in another place/method
}
