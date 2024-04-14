public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product() {

    }

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;// auto CONSTRUCTOR
    }//this is our BASE class "PRODUCT" file/the COMPUTER
}

//////////////// 👇👇👇 MONITOR class 👇👇👇 ////////////////////
class Monitor extends Product {

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format(
                "Drawing pixel at %d,%d in color %s ", x, y, color
        ));
    }
}// this is a SUBCLASS for the PRODUCT

//////////////// 👆👆👆 MONITOR class 👆👆👆 ////////////////////

/////////////// 🔻🔻🔻 motherboard class 🔻🔻🔻//////////////////
class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;//ENCAPSULATION

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }//constructor

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }//another constructor

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }
}
///////////////motherboard class 🔼🔼🔼//////////////////

/////////////// ComputerCase 🔽🔽🔽 ///////////////////
class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
}