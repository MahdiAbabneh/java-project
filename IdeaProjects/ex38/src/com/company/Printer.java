package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        else
            tonerLevel = -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100)
                return -1;
            else
                this.tonerLevel = this.tonerLevel + tonerAmount;
        }
        return this.tonerLevel;
    }

    public int printPages(int pagesToPrint) {
        if (duplex) {
            System.out.println("Printing in duplex mode");
            this.pagesPrinted = this.pagesPrinted + (pagesToPrint / 2);
            return pagesToPrint / 2;
        } else {
            this.pagesPrinted = this.pagesPrinted + pagesToPrint;
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
