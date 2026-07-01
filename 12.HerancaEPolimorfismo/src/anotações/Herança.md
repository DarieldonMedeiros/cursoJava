# Herança

- É um tipo de associação que permite que uma classe herde TODOS os dados e comportamentos de outra
- Definições importantes
  - Herança é uma relação "é-um"
  - Generalização/especialização (Account - classe geral, BusinessAccount - classe específica)
  - Superclasse (classe base) / subclasse (classe derivada): Account - superclasse, BusinessAccount - subclasse
  - Herança/Extensão: a classe BusinessAccount está estendendo a classe Account (colocando mais funcionalidades)
  - Herança é uma associação entre classes (e não entre objetos), pois o objeto BusinessAccount é somente um objeto que contém todos os atributos e métodos de Account

- Vantagens
  - Reuso
  - Polimorfismo
- Sintaxe
  - `class A extends B`

## Exemplo

```
Account
  - Integer number
  - String holder
  - Double balance
  + void withdraw(Double amount)
  + void deposit(Double amount)

BusinessAccount
  - Integer number         - pode herdar de Account
  - String holder          - pode herdar de Account
  - Double balance         - pode herdar de Account
  - Double loanLimit       (limite de empréstimo)
  + void withdraw(Double amount) - pode herdar de Account
  + void deposit(Double amount)  - pode herdar de Account
  + void loan(Double amount)     (empréstimo)
```

Neste caso a herança permite o reuso de atributos e métodos, sendo assim ficando dessa maneira:

```
BusinessAccount extends Account
  - Double loanLimit
  + void loan(double amount)
```
