package entities;

@SuppressWarnings("unused")
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super(); // Caso seja incluída uma lógica no construtor padrão da classe Account, o super puxa para essa classe
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10; // Para poder acessar um atributo da classe pai, utiliza-se o protected
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
