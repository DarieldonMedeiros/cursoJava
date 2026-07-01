# Interfaces

## Avisos

- A partir do Java 8, interfaces podem ter "default methods" ou "defender methods".
  - A partir do Java 8, as interfaces podem ter definição de método.
- Isso possui implicações conceituais práticas, que serão discutidas mais adiante neste capítulo.
- Primeiro vamos trabalhar com a definição "clássica" de interfaces. Depois vamos acrescentar o conceito de default methods.

## Interface

Interface é um tipo que define um conjunto de operações que uma classe deve implementar.

A interface estabelece um **CONTRATO** que a classe deve cumprir.
- As subclasses **DEVEM** ter os métodos declarados na interface.

### Exemplo

```java
interface Shape {
    double area();
    double perimeter();
}
```

### Para quê interfaces?

- Para criar sistemas com **BAIXO ACOPLAMENTO** e **FLEXÍVEIS**.
