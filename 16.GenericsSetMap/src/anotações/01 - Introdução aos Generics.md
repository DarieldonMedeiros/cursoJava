# Introdução aos Generics

## Generics

- **Generics** permitem que CLASSES, INTERFACES e MÉTODOS possam ser parametrizados por tipo. Seus benefícios são:
  - Reuso
  - Type safety
  - Desempenho
- Uso comum: coleções

```java
List<String> list = new ArrayList<>(); // Essa lista é parametrizada para o tipo String
list.add("Maria");
String name = list.get(0);
```

## Problema motivador 1 (reuso)

Deseja-se fazer um programa que leia uma quantidade N, e depois N números inteiros. Ao final, imprima esses números de forma organizada, conforme exemplo. Em seguida, informar qual foi o primeiro valor informado.
