package interfacesegregation;

public class SimplePrinter implements Printer {
    @Override
    public void print() {
        System.out.println("Printing...");
    }
}
