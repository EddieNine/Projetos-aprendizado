package ModificadoresAcesso;

public class App {
    public static void main(String[] args) {
        ContaNetflix conta = new ContaNetflix();
        conta.entrar();
        conta.assistirFilme("Venom 2");

    }
}
