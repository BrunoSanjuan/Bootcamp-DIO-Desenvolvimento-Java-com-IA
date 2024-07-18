import java.util.Scanner;

public class Operacoes {

    Scanner scanner = new Scanner(System.in);

    double saldo;

    public void depositar () {
    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
    System.out.println("Digite o valor do deposito: ");
    double depositar = scanner.nextDouble();
    saldo = saldo+depositar;
    System.out.println("Saldo atual: " + saldo);
    }

    public void saque () {
        // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
        System.out.println("Digite o valor do saque: ");
        double saque = scanner.nextDouble();
        saldo = saldo - saque;
        System.out.println("Saldo atual: " + saldo);
    }

    public void consultaSaldo () {
        // TODO: Exibir o saldo atual da conta.
        System.out.println("Saldo atual: " + saldo);
    }
}
