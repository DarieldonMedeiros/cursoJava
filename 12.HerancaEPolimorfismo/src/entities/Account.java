package entities;

@SuppressWarnings("unused")
public class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    // Não posso mudar o saldo da conta livremente, logo não deixar público o setBalance

    public void withdraw(Double amount) {
        this.balance -= amount + 5.0;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }
}
