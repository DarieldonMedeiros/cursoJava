package entities;

public class Banco {

    private final int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;
    
    // Assim protege o construtor se a regra de negócio do depósito mudar
    public Banco(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        deposito(depositoInicial);
    }
    public Banco(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }


    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void saque (double valor) {
        this.saldo -= (valor + 5);
    }

    public void deposito (double valor) {
        this.saldo += valor;
    }

    public String toString() {
        return "Account "
            + numeroDaConta
            + ", Holder: "
            + nomeDoTitular
            + ", Balance: $"
            + String.format("%.2f", saldo);
    }
}
