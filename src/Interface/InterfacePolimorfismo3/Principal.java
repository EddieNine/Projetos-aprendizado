package Interface.InterfacePolimorfismo3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        while (escolha != 4) {
            System.out.println("\033[34mEscolha o Automovel:" +
                    "\n[1] >>> Carro" +
                    "\n[2] >>> Moto" +
                    "\n[3] >>> Caminhao" +
                    "\n[4] >>> Sair\033[m");
            escolha = scanner.nextInt();
            scanner.nextLine();
            Veiculo veiculos = null;

            switch (escolha) {
                case 1:
                    System.out.println("Digite a marca do carro: ");
                    String marcaCarro = scanner.nextLine();
                    System.out.println("Digite o modelo do carro: ");
                    String modeloCarro = scanner.nextLine();
                    System.out.println("Digite o numero de portas do carro: ");
                    int portas = scanner.nextInt();
                    veiculos = new Carro(marcaCarro, modeloCarro, portas);
                    break;
                case 2:
                    System.out.println("Digite a marca do moto: ");
                    String marcaMoto = scanner.nextLine();
                    System.out.println("Digite o modelo do moto: ");
                    String modeloMoto = scanner.nextLine();
                    System.out.println("Digite o numero de cilindradas: ");
                    double numeroCilindradas = scanner.nextDouble();
                    veiculos = new Moto(marcaMoto, modeloMoto, numeroCilindradas);
                    break;
                case 3:
                    System.out.println("Digite a marca do caminhao: ");
                    String marcaCaminhao = scanner.nextLine();
                    System.out.println("Digite o modelo do caminhao: ");
                    String modeloCaminhao = scanner.nextLine();
                    System.out.println("Digite a capacidade de Carga: ");
                    double capacidadeCarga = scanner.nextInt();
                    veiculos = new Caminhao(marcaCaminhao, modeloCaminhao, capacidadeCarga);
                    break;
                case 4:
                    System.out.println("\033[32mVoce esta saindo do programa!\033[m");
                    break;
                default:
                    System.out.println("\033[31mDigite um valor correto!\033[m");
            }
            System.out.println("---------------------------");
            veiculos.acelerar();
            veiculos.frear();
            System.out.println("---------------------------");
            veiculos.exibirDetalhes();
            System.out.println();

        }
    }
}
