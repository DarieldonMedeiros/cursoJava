public class ProcessamentoDados {

    public static void main(String[] args) {
        
        int x;
        double y;
        x = 5;
        y = 2 * x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        double B, b, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (B + b) * h / 2.0;

        System.out.println("Area = " + area + "cm²");

        float B1, b1, h1, area1;
        b1 = 6f;
        B1 = 8f;
        h1 = 5f;

        area1 = (B1 + b1) * h1 / 2f;

        System.out.println("Area = " + area1 + "cm²");

        int a, b2;
        double resultado;

        a = 5;
        b2 = 2;

        resultado = (double) a / b2;
        System.out.println("Resultado = " + resultado);

        double a2;
        int b3;

        a2 = 5.0;
        b3 = (int) a2;

        System.out.println("b = " + b3);

    }
}
