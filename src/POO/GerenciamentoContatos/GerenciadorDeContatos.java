package POO.GerenciamentoContatos;

import java.util.Scanner;

public class GerenciadorDeContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        // Carrega os contatos do arquivo ao iniciar o programa
        agenda.carregarContatos();

        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Visualizar Contatos");
            System.out.println("3. Editar Contato");
            System.out.println("4. Excluir Contato");
            System.out.println("5. Pesquisar Contato");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    agenda.adicionarContato(new Contato(nome, telefone, email));
                    break;
                case 2:
                    agenda.visualizarContatos();
                    break;
                case 3:
                    System.out.print("Nome do contato a ser editado: ");
                    String nomeParaEditar = scanner.nextLine();
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo Telefone: ");
                    String novoTelefone = scanner.nextLine();
                    System.out.print("Novo Email: ");
                    String novoEmail = scanner.nextLine();
                    agenda.editarContato(nomeParaEditar, new Contato(novoNome, novoTelefone, novoEmail));
                    break;
                case 4:
                    System.out.print("Nome do contato a ser excluído: ");
                    String nomeParaExcluir = scanner.nextLine();
                    agenda.excluirContato(nomeParaExcluir);
                    break;
                case 5:
                    System.out.print("Nome do contato a ser pesquisado: ");
                    String nomeParaPesquisar = scanner.nextLine();
                    Contato contato = agenda.pesquisarContato(nomeParaPesquisar);
                    if (contato != null) {
                        System.out.println(contato);
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
