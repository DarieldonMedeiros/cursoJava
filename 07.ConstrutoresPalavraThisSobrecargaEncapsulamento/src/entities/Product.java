package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    // Por convenção, utiliza-se o mesmo nome da variável
    public Product(String name, double price, int quantity) {
        // this => uma referência para o próprio objeto
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Este método inicia com quantity = 0
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Sobrecarga => recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.
    public Product() {
        // Construtor Padrão
    }

    // Encapsulamento => princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock());
    }

}
