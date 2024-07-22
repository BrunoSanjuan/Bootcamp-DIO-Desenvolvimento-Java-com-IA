import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        //System.out.println("Digite o valor do saldo: R$");
        //double saldo = scanner.nextDouble();
        double saldo = 1000;
        System.out.println("Saldo Atual: R$" + saldo);

        System.out.println("Digite o valor do saque: R$ ");
        double saque = scanner.nextDouble();

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // TODO: Imprimir "Transação realizada com sucesso."
            System.out.println("Transacao realizada com sucesso.");
        }else if (saque <= saldo + limiteChequeEspecial) {
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        }else{
          System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
