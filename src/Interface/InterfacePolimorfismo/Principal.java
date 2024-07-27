package Interface.InterfacePolimorfismo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione o metodo de pagamento:");
        System.out.println("1. Cartão de Crédito:");
        System.out.println("2. Paypal:");
        System.out.println("3. Boleto:");
        int escolha = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha

        Pagamento pagamento = null;

        switch (escolha) {
            case 1:
                System.out.println("Digite o número do cartão: ");
                String numeroCartao = sc.nextLine();
                System.out.println("Digite o nome do titular: ");
                String nomeTitular = sc.nextLine();
                pagamento = new CartaoCredito(numeroCartao, nomeTitular);
                break;
            case 2:
                System.out.print("Digite o email do PayPal: ");
                String email = sc.nextLine();
                System.out.print("Digite a senha do PayPal: ");
                String senha = sc.nextLine();
                pagamento = new PayPal(email, senha);
                break;
            case 3:
                System.out.println("Digite o número do boleto: ");
                String numeroBoleto = sc.nextLine();
                System.out.println("Digite a data de vencimento: ");
                String dataVencimento = sc.nextLine();
                pagamento = new Boleto(numeroBoleto, dataVencimento);
                break;
            default:
                System.out.println("Método de pagamento inválido.");
                sc.close();
                return;
        }

        System.out.println("Digite o valor do pagamento: ");
        double valor = sc.nextDouble();

        pagamento.realizarPagamento(valor);
        pagamento.exibirDetalhesPagamento();

        sc.close();
    }
}
