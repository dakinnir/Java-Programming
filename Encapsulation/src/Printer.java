public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPages, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = 0;
        }
        this.pagesPrinted = numberOfPages;
        this.isDuplex = isDuplex;
    }

    public void fillTonerUp(int tonerLevel) {
        if (tonerLevel < 100) {
            this.tonerLevel += tonerLevel;
        } else {
            System.out.println("Cannot fill up toner level anymore");
        }
    }

    public int printPages(int number) {
        if (isDuplex) {
            number = (number / 2) + (number % 2);
            System.out.println(number);
        }
        this.pagesPrinted += number ;
        return this.pagesPrinted;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
