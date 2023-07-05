package interfacesegregation;

public class AllInOnePrinter implements Scanner , Printer{
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

