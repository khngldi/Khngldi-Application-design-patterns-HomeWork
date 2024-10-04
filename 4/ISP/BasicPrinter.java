package ISP;

import ISP.Iprinter;

public class BasicPrinter implements Iprinter {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}