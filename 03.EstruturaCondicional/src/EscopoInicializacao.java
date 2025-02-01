public class EscopoInicializacao {

    public static void main(String[] args) {
        
        // Se a variável não for inicializada, ela não pode ser lida
        double price = 400.00;

        // Escopo: a variável só fica declarada no escopo onde ela foi definida, fora dele a variável não é mais definida
        double discount = (price < 200.00) ? price * 0.1 : 0;

        System.out.println(discount);
    }
}
