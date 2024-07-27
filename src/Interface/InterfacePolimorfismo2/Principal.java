package Interface.InterfacePolimorfismo2;

public class Principal {
    public static void main(String[] args) {
        Funcionario assalariado = new Assalariado("Edcarlos", 1100.0);
        Funcionario horista = new Horista("David", 8, 10.50);
        Funcionario comissionado = new Comissionado("Cueio", 50, 18.5);

        System.out.println("Assalariado");
        assalariado.calcularSalario();
        assalariado.exibirDetalhes();
        System.out.println();
        System.out.println("Horista");
        horista.calcularSalario();
        horista.exibirDetalhes();
        System.out.println();
        System.out.println("Comissionado");
        comissionado.calcularSalario();
        comissionado.exibirDetalhes();
    }
}
