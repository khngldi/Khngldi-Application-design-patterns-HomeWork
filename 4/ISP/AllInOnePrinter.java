package ISP;

import ISP.IFax;
import ISP.Iprinter;
import ISP.Iscanner;

public class AllInOnePrinter implements Iprinter, Iscanner, IFax {
    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scan(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void fax(String content) {
        System.out.println("Faxing: " + content);
    }
}
