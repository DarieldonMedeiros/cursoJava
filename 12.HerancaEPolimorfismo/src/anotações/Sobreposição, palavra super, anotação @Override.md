# Sobreposição, palavra super, anotação @Override

## Sobreposição ou sobrescrita

- É a implementação de um método de uma superclasse na subclasse
- É fortemente recomendável usar a anotação `@Override` em um método sobrescrito
  - Facilita a leitura e compreensão do código
  - Avisamos ao compilador (boa prática)

### Exemplo

Suponha que a operação de saque possua uma taxa no valor de 5,0. Entretanto, se a conta for do tipo poupança, esta taxa não deve ser cobrada. Como resolver isso? Resposta: sobrescrevendo o método `withdraw` na subclasse `SavingsAccount`.

## Palavra `super`

É possível chamar a implementação da superclasse utilizando a palavra `super`.

### Exemplo

Suponha que, na classe `BusinessAccount`, a regra para saque seja realizar o saque normalmente da superclasse e descontar mais 2,0.
