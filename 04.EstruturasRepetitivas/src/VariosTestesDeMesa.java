public class VariosTestesDeMesa {

    public static void main(String[] args) {
        // MESA 1:
        System.out.println("MESA 1");
        int x1 = 5;
        int y1 = 0;
        while (x1 > 2) {
            System.out.println(x1 + "-" + y1);
            y1 += x1;
            x1--;
        }
        System.out.println("FIM DA MESA 1");

        // MESA 2:
        System.out.println("MESA 2");
        int x2 = 2;
        int y2 = 0;
        while (x2 < 60) {
            System.out.println(x2 + "-" + y2);
            x2 *= 2;
            y2 += 10;
        }
        System.out.println("FIM DA MESA 2");

        // MESA 3:
        System.out.println("MESA 3");
        double x3 = 100;
        double y3 = 100;
        while (x3 != y3) {
            System.out.println("olha");
            x3 = Math.sqrt(y3);
        }
        System.out.println("FIM DA MESA 3");

        // MESA 4:
        System.out.println("MESA 4");
        int x4 = 0;
        int y4 = 0;
        while (x4 < 5) {
            y4 = x4 * 3;
            System.out.println(y4 + "-" + x4);
            x4++;
        }
        System.out.println("FIM DA MESA 4");

        // MESA 5:
        System.out.println("MESA 5");
        int x5 = 2;
        int y5 = 10;
        System.out.println("Olá");
        while (x5 < y5) {
            System.out.println(x5 + "-" + y5);
            x5 *= 2;
            y5++;
        }
        System.out.println("FIM DA MESA 5");

        // MESA 6:
        System.out.println("MESA 6");
        int x6 = 4;
        int y6 = 0;
        int i = 0;
        while (i < x6) {
            i++;
            y6 += i;
            System.out.println(i + "-" + y6);
        }
        System.out.println("FIM DA MESA 6");
    }
}
