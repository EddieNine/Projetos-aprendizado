package POO.GerenciamentoContatos;

import java.io.*;
import java.util.ArrayList;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        salvarContatos();
    }

    public void visualizarContatos() {
        if(contatos.isEmpty()) {
            System.out.println("A lista de contatos está vazia");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }

    public void editarContato(String nome, Contato novoContato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                contatos.set(i, novoContato);
                System.out.println("Contato editado com sucesso!");
                salvarContatos();
                return;
            }
        }
        System.out.println("Contato não encontrado");
    }

    public void excluirContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getNome().equals(nome)) {
                contatos.remove(i);
                System.out.println("Contato escluído com sucesso!");
                salvarContatos();
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }

    public Contato pesquisarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        System.out.println("Contato não encontrado.");
        return null;
    }

    public void salvarContatos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("contatos.txt"))) {
            for (Contato contato : contatos) {
                writer.write(contato.getNome() + "," + contato.getTelefone() + "," + contato.getEmail());
                writer.newLine();
            }
        }catch (IOException e ){
            System.out.println("Erro ao salvar contatos " + e.getMessage());
        }
    }

    public void carregarContatos() {
        try (BufferedReader reader = new BufferedReader(new FileReader("contatos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 3) {
                    Contato contato = new Contato(dados[0], dados[1], dados[2]);
                    contatos.add(contato);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar contatos: " + e.getMessage());
        }
    }
}
