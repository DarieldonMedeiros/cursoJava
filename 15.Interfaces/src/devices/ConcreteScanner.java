package devices;

public class ConcreteScanner extends Device implements ScannerA {

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("ScannerA processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scanned content";
    }
}
