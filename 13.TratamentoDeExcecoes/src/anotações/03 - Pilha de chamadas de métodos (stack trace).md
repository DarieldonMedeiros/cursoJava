# Pilha de chamadas de métodos (stack trace)

Em um programa Java a stack trace segue da seguinte maneira:

```
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
  at application.ProgramTryCatch.method2(ProgramTryCatch.java: 25)   - linha do erro de fato
  at application.ProgramTryCatch.method1(ProgramTryCatch.java: 14)   - linha onde o method1 chama o method2
  at application.ProgramTryCatch.main(ProgramTryCatch.java: 8)       - linha onde o main chama o method1
```
