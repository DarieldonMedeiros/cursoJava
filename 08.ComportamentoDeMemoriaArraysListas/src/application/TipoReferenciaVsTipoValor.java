package application;
// Classe -> Variável tipo referêcia
// Exemplo: Product p1, p2;
// p1 = new Product("TV", 900.00, 0);
// p1 -> guarda o endereço de memória(0x100358) no stack
// 0x100358 -> guarda os valores das variáveis no heap

// Tipos valor são caixas e não ponteiros
// Exemplo: double x, y; se y = x, ele não recebe uma referência mas uma cópia
public class TipoReferenciaVsTipoValor {

    public static void main(String[] args) {
        int p;
        p = 10;
        System.out.println(p);

        // Atribuir new para qualquer tipo estruturado são atribuídos valores padrão a seus elementos:
        // números -> 0
        // boolean -> false
        // char -> caractere código 0
        // objeto -> null
    }
}
