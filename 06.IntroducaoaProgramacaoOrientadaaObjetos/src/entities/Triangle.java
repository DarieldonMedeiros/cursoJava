package entities;

// Triângulo é uma entidade
public class Triangle {

    public double a;
    public double b;
    public double c;

    // CADA CLASSE É RESPOSÁVEL POR SI MESMA (COESÃO)
    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}