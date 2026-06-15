package devices;

public class ComboDevice extends Device implements ScannerA, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    // A obrigação de implementar elimina a ambiguidade do problema do diamante.
    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }
}
