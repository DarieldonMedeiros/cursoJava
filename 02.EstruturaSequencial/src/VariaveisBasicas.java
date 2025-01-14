public class VariaveisBasicas {
    /*
     * Variável => porção da memória RAM para armazenar dados
     * <tipo> <nome> = <valor inicial>;
     * byte => inteiro de 8 bits
     * short => inteiro de 16 bit
     * int => número inteiro de 32 bits
     * long => inteiro de 64 bits
     * float => números com casas decimais de 32 bits
     * double => números com casas decimais de 64 bits
     * char => 1 caractere unicode de 16 bits
     * string => cadeia de caracteres (palavras ou textos)
     * boolean => valor verdade de 1 bit (false, true)
     */
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.68;
        char sexo = 'F';

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
    }
}
