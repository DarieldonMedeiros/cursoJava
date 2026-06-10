package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramAccount {
    @SuppressWarnings({"ConstantValue", "ReduntantCast", "ConstantConditions", "UnnecessaryCast", "PatternVariableCanBeUsed", "unused"})
    public static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0);

        @SuppressWarnings("redundant")
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc; // A herança é uma relação "é-um", logo é perfeitamente possível atribuir uma
        // variável do tipo Account com uma variável do tipo BusinessAccount
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING

        @SuppressWarnings("CastCanBeRemovedNarrowingVariableType")
        BusinessAccount acc4 = (BusinessAccount) acc2; // Não se pode atribuir um objeto account para um objeto BusinessAccount, sendo assim é necessário o casting
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3; // Operação não permitida, pois gera um ClassCastException

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        // SOBREPOSIÇÃO

        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.02);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        // POLIMORFISMO

        Account acc9 = new Account(1004, "Darieldon", 1000.0);
        Account acc10 = new SavingsAccount(1005, "Rebeca", 1000.0, 0.01);

        acc9.withdraw(50.0);
        acc10.withdraw(50.0);
        System.out.println(acc9.getBalance());
        System.out.println(acc10.getBalance());

        // CLASSE ABSTRATA: (a partir desta linha a classe Account se torna abstrata e todas as linhas acima
        // comentadas
        List<Account> list = new ArrayList<>();
        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
        list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.00, 500.00));

        double sum = 0.0;
        for (Account a : list) {
            sum += a.getBalance();
        }
        System.out.printf("Total Balance: %.2f\n",  sum);

        for (Account a : list) {
            a.deposit(10.0);
            System.out.printf("Updated balance for account %d: %.2f\n", a.getNumber(), a.getBalance());
        }


    }
}
