package interfacesegregation;

public class Main {
    public static void main(String[] args) {
        Printer allInOnePrinter = new AllInOnePrinter();
        allInOnePrinter.print();
        ((Scanner) allInOnePrinter).scan(); //

        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print();

    }

}
