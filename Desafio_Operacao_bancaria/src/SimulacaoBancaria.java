import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {

        Operacoes operacoes = new Operacoes();
        Scanner scan = new Scanner(System.in);

        //double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("- - - - - MENU - - - - -");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");


            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    operacoes.depositar();
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    operacoes.saque();
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    operacoes.consultaSaldo();;
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scan.close();
    }
}
