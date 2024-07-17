
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/*Vamos ver o funcionamento de exceções em Java. Aparentemente é um programa simples abaixo, mas vamos listar
 alguns possíveis exceções que podem acontecer:
 * - Não informar o nome e sobrenome 
 * - O valor da idade ter um caractere NÃO númerico
 * - O valor da altura ter uma vírguma ao invés de um ponto (conforme padrão americano)
 */

public class AboutMe {
    public static void main(String[] args) {

        try {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser númericos");
        }
    }
}
