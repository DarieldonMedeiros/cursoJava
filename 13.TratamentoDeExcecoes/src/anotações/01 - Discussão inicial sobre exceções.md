# Discussão inicial sobre exceções

## Exceções

- Uma **exceção** é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução.
- Em Java, uma exceção é um objeto herdado da classe:
  - `java.lang.Exception` - o compilador obriga a tratar ou propagar
  - `java.lang.RuntimeException` - o compilador não obriga a tratar ou propagar
- Quando lançada, uma exceção é propagada na pilha de chamadas de métodos em execução, até que seja capturada (tratada) ou o programa seja encerrado.

## Hierarquia de exceções do Java

```
Throwable
  |______ Error (não tratado)
  |         |______ OutOfMemoryError (estourou a memória - programa vai encerrar)
  |         |______ VirtualMachineError (erro na máquina virtual - programa vai encerrar)
  |
  |______ Exception (tem a possibilidade de tratar)
            |______ IOException (erro de entrada/saída)
            |______ RuntimeException
                       |______ IndexOutOfBoundsException (acessando um elemento inexistente no array)
                       |______ NullPointerException (quando tenta acessar uma variável valendo null)
```

## Por que Exceções?

O modelo de tratamento de exceções permite que erros sejam tratados de forma consistente e flexível, usando boas práticas.

**Vantagens:**
- Delega a lógica do erro para a classe responsável por conhecer as regras que podem ocasionar o erro
- Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
- A exceção pode carregar dados quaisquer (a classe pode ter atributos)
