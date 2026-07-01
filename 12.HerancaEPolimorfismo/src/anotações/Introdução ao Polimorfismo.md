# Introdução ao Polimorfismo

## Pilares da OOP (Programação Orientada a Objetos)

- **Encapsulamento** (não deixar variáveis expostas) → métodos get e set
- **Herança** (uma classe pode ser subclasse de outra e herdar os métodos)
- **Polimorfismo** (tópico desta aula)

## Polimorfismo (Muitas formas)

Em Programação Orientada a Objetos, polimorfismo é o recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para objetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.

### Exemplo

```java
Account x = new Account(1020, "Alex", 1000.0);
Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

x.withdraw(50.0); // withdraw em Account desconta um valor de 5,0 no saque
y.withdraw(50.0); // withdraw em SavingsAccount não desconta valor no saque
```

Neste caso, as funções `withdraw` vão ocorrer de maneiras diferentes.

### Importante entender

- A associação do tipo específico com o tipo genérico é feita em tempo de execução (upcasting).
- O compilador não sabe para qual tipo específico a chamada do método `withdraw` está sendo feita. (ele só sabe que são duas variáveis do tipo `Account`).
