import java.util.Locale;
import java.util.Scanner;


public class EntradaScanner {
    public static void main(String[] args) {
        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Olá" + " " + nome + " " + sobrenome + ", " + "sua altura é" + " " + altura + "cm");
    }
}
