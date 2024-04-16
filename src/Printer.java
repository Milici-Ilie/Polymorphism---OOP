public class Printer {

    private int tonerLevel;
    private int pagesPrinted;// we don't have to set the "pagesPrinted" in the CONSTRUCTOR because is 0 based
    private boolean duplex;// creating the private ENCAPSULATION

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel < 0 && tonerLevel > 100) ? tonerLevel : -1;//checking if the "tonerLevel" fits in the parameters
        this.duplex = duplex;
    }//CONSTRUCTOR

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if(tempAmount < 0 || tempAmount > 100){
            return -1;
        }

        tonerLevel += tonerAmount;//when access this method we will add some amount of toner
        return tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
