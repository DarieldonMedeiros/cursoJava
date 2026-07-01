# Herança Múltipla e o Problema do Diamante

## Problema do Diamante

```
                    abstract class Device
                    - String serialNumber
                    + void processDoc(String doc);
                              /\
                             /  \
                            /    \
                           /      \
                          /        \
                         /          \
                        /            \
  class Scanner extends Device        class Printer extends Device
  + void processDoc(String doc);      + void processDoc(String doc);
  + String scan();                     + void print(String doc);
                        \              /
                         \            /
                          \          /
                           \        /
                            \      /
                             \    /
                              \  /
                               \/
              class ComboDevice extends Scanner, Printer
```

A herança múltipla pode gerar o problema do diamante: uma ambiguidade causada pela existência do mesmo método em mais de uma superclasse.

**Herança múltipla não é permitida na maioria das linguagens!**

Porém, uma classe pode implementar mais de uma interface:

```java
abstract class Device {
    private String serialNumber;
    public void processDoc(String doc);
}

interface Scanner {
    String scan();
}

interface Printer {
    void print(String doc);
}

class ComboDevice extends Device implements Scanner, Printer {
    public void processDoc(String doc);
    public String scan();
    public void print(String doc);
}
```

**ATENÇÃO:**
- Isso **NÃO** é herança múltipla, pois **NÃO HÁ REUSO** na relação entre ComboDevice e as interfaces Scanner e Printer.
- ComboDevice não herda, mas sim implementa as interfaces (cumpre o contrato).
- Tem autores que discordam dessa afirmação e dizem que implementar mais de uma interface é uma herança múltipla.
- Se pegar o conceito de reuso, não há entre as interfaces.
