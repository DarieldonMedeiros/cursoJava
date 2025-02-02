public class FuncoesInteressantesParaString {

    public static void main(String[] args) {
        
        String original = "abcde FGHIJ ABC abc DEFG    ";
        // ALTERAÇÕES DA STRING ORIGINAL
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        String[] s08 = original.split(" ");
        String s09 = s08[0];
        String s10 = s08[1];
        String s11 = s08[2];
        String s12 = s08[3];
        String s13 = s08[4];

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("indexOf('bc'): " + i);
        System.out.println("lastIndexOf('bc'): " + j);
        System.out.println("Split(0): -" + s09 + "-");
        System.out.println("Split(1): -" + s10 + "-");
        System.out.println("Split(2): -" + s11 + "-");
        System.out.println("Split(3): -" + s12 + "-");
        System.out.println("Split(4): -" + s13 + "-");

    }
}
