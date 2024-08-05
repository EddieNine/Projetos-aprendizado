package Desafios.Fibonacci;

public class FibonacciSequence {
    public static void main(String[] args) {
        int n = 10;
        int num1 = 0, num2 = 1;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
