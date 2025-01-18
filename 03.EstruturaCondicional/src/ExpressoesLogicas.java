public class ExpressoesLogicas {

    public static void main(String[] args) {
        int x = 5;

        // OPERADOR "E" = &&
        System.out.println("OPERADOR 'E' = &&");
        boolean op01 = x <= 20 && x == 10;
        boolean op02 = x > 0 && x != 3;
        boolean op03 = x <= 20 && x == 10 && x != 3;

        System.out.println("x <= 20 && x == 10? Resposta: " + op01);
        System.out.println("x > 0 && x != 3? Resposta: " + op02);
        System.out.println("x <= 20 && x == 10 && x != 3? Resposta: " + op03);

        // OPERADOR "OU" = ||
        System.out.println("\nOPERADOR 'OU' = ||");
        boolean op04 = x <= 20 || x == 10;
        boolean op05 = x > 0 || x != 3;
        boolean op06 = x <= 0 || x != 3 || x != 5;

        System.out.println("x <= 20 || x == 10? Resposta: " + op04);
        System.out.println("x > 0 || x != 3? Resposta: " + op05);
        System.out.println("x <= 0 || x != 3 || x != 5? Resposta: " + op06);

        // OPERADOR "NÃO" = !
        System.out.println("\nOPERADOR 'NÃO' = !");

        boolean op07 = !(x == 10);
        boolean op08 = !(x >= 2);
        boolean op09 = !(x <= 20 && x == 10);

        System.out.println("!(x == 10)? Resposta: " + op07);
        System.out.println("!(x >= 2)? Resposta: " + op08);
        System.out.println("!(x <= 20 && x == 10)? Resposta: " + op09);
    }
}
