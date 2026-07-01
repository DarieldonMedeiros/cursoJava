# Inversão de Controle e Injeção de Dependência

## Acoplamento forte

A classe `RentalService` conhece a dependência concreta. Se a classe concreta mudar, é preciso mudar a classe `RentalService`.

```
RentalService                                      BrazilTaxService
- Double pricePerHour
- Double pricePerDay              ---------------> + Double tax(Double amount)
+ void processInvoice(CarRental carRental)
```

```java
class RentalService {
    (...)
    private BrazilTaxService taxService; // é necessário alterar aqui
}
```

## Acoplamento fraco

A classe `RentalService` não conhece a dependência concreta. Se a classe concreta mudar, a classe `RentalService` não muda nada.

```
RentalService                                      <<Interface>>
- Double pricePerHour                               TaxService
- Double pricePerDay              ---------------> + Double tax(Double amount)
+ void processInvoice(CarRental carRental)                    /\
                                                                |
                                                                |
                                                     BrazilTaxService
                                                     + Double tax(Double amount)
```

```java
class RentalService {
    (...)
    private TaxService taxService; // não é necessário alterar aqui
}
```

## Injeção de Dependência por meio de construtor

```java
class Program {
    static void main(String[] args){
        (...)
        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        // na declaração do TaxService ocorre um UPCASTING (chamando uma classe mais específica)
    }
}

class RentalService {
    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
}
```

## Inversão de controle

- **Inversão de controle**
  - Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências.
- **Injeção de dependência**
  - É uma forma de realizar a inversão de controle: um componente externo instancia a dependência, que é então injetada no objeto "pai". Pode ser implementada de várias formas:
    - Construtor
    - Classe de instanciação (builder / factory)
    - Container / framework
