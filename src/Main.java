import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar uma noa conta bancária com o saldo inicial
        System.out.println("Digite o saldo inicial");
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a entrada com o valor do despósito e acionar o método "depositar"
        System.out.println("Digite o valor do deposito");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a entrada com o valor do saque e adcionar o método "sacar"
        System.out.println("Digite o valor do saque");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        // Incrimentar o saldo com o valor e imprimir "Depósito feito."
        this.saldo += valor;
        System.out.println("Deposito feito.");
        imprimirSaldo();
    }

    public void sacar(double valor) {
        // verificar se o saldo é suficiente para o saque
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque feito");
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
        imprimirSaldo();
    }

    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.2f\n", this.saldo);
    }
}
