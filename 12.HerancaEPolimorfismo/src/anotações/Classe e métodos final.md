# Classe e métodos final

- Palavra-chave: `final`
- **Classe**: evita que a classe seja herdada

  ```java
  public final class SavingsAccount{
  
  }
  ```

- **Método**: evita que o método seja sobreposto

## Exemplo - Classe final

Suponha que você queira evitar que sejam criadas subclasses de `SavingsAccount`:

```java
public final class SavingsAccount{
    
}
```

A palavra-chave `final` evita que a classe possa ser herdada, logo se for criar uma subclasse chamada `SavingsAccountPlus`, ela não poderá acessar os métodos de `SavingsAccount`.

## Exemplo - Método final

Suponha que você não queira que o método `withdraw` de `SavingsAccount` seja sobreposto:

```java
@SuppressWarnings("FinalMethodInFinalClass")
public final void withdraw(double amount) {
    
}
```

## Pra quê?

- **Segurança**: dependendo das regras do negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto.
  - Geralmente convém acrescentar `final` em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências
- **Desempenho**: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução.
  - Exemplo clássico: `String` (String é uma class `final`)
