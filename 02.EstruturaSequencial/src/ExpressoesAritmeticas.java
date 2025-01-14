public class ExpressoesAritmeticas {
    /*
     * + => adição
     * - => subtração
     * * => multiplicação
     * / => divisão
     * % => resto da divisão (mod)
     * Ordem de precedência:
     *  - 1° Lugar: * / %
     *  - 2° Lugar: + -
     *  - 3° Tudo que está entre (parênteses) é calculado antes
     */
    public static void main(String[] args) {
        int Op01 = 2 * 6 / 3;
        int Op02 = 3 + 2 * 4;
        int Op03 = (3 + 2) * 4;
        int Op04 = 60/(3 + 2) * 4;
        int Op05 = 60/((3 + 2) * 4);
        int Op06 = 14 % 3;
        int Op07 = 19 % 5;

        System.out.println("2 * 6 / 3 = " + Op01);
        System.out.println("3 + 2 * 4 = " + Op02);
        System.out.println("(3 + 2) * 4 = " + Op03);
        System.out.println("60/(3 + 2) * 4 = " + Op04);
        System.out.println("60/((3 + 2) * 4) = " + Op05);
        System.out.println("14 % 3 = " + Op06);
        System.out.println("19 % 5 = " + Op07);
    }
}
