# Métodos Abstratos

- São métodos que **não possuem implementação**
- Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação
- Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata.
- **Notação UML:** itálico

## Exercício resolvido

```java
abstract class Shape:                    // classe pai
  - Color color
  + Double area()                        // muito genérico, cada forma tem sua forma de calcular a área
```

```java
class Rectangle extends Shape:
  - Double width
  - Double height
  + Double area() return width * height
```

```java
class Circle extends Shape:
  - Double radius
  + Double area() return Math.PI * radius * radius
```

```java
enum Color
  - BLACK
  - BLUE
  - RED
```
