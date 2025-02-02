public class VariosTestesDeMesaFor {

    public static void main(String[] args) {
        
        // MESA 1
        System.out.println("MESA 1");
        int x1 = 4;
        int y1 = x1 + 2;
        for(int i = 0; i < x1; i++) {
            System.out.print(x1 + " " + y1);
            y1 = y1 + i;
        }
        System.out.println("\nFIM DA MESA 1\n");

        // MESA 2
        System.out.println("MESA 2");
        int x2 = 0;
        int y2 = 0;
        for(int i = 1; i < 5; i++) {
            y2 = i - 1;
            x2 = i * 10;
            System.out.println(x2 + " " + y2 + " " + i);
        }
        System.out.println("FIM DA MESA 2\n");

        // MESA 3
        System.out.println("MESA 3");
        int y3 = 10;
        for (int i = 0; i < 4; i++) {
            System.out.print(i);
            y3 += i;
            System.out.println(y3);
        }
        System.out.println("FIM DA MESA 3\n");

        // MESA 4
        System.out.println("MESA 4");
        int x4 = 4;
        int y4 = 0;
        for (int i = 0; i < x4; i++) {
            System.out.print(i);
            System.out.println(x4);
            System.out.println(y4);
            y4 += 10;
        }
        System.out.println("FIM  DA MESA 4\n");

        // MESA 5
        System.out.println("MESA 5");
        int x5 = 4;
        int y5 = 0;
        for (int i = 0; i < x5; i++) {
            y5 += i;
        }
        System.out.println(y5);
        System.out.println("FIM DA MESA 5\n");

        // MESA 6
        System.out.println("MESA 6");
        int x6 = 8;
        int y6 = 3;
        for (int i = 0; i < x6; i++) {
            x6 -= 2;
            y6++;
            System.out.println(x6 + " " + y6 + " " + i);
        }
        System.out.println("FIM DA MESA 6");
    }
}
