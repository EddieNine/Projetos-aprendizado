package Static;

public class Matematica {
    private static double valorPi = 3.14f;

    public static int somar(int numeroA, int numeroB) {
        return numeroA + numeroB;
    }

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    private static double calcularDobroAreaCirculo(double raio) {
        double area = calcularDobroAreaCirculo(raio);
        return area;
    }

    public static double calcularAreaCirculo(double raio) {
        double area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
