public class BreakAndContinue {

/*Break significar parar, quebrar, frear, interromper o laço
 * Continue como o próprio nome sugere, continua o script
 */

    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
                // continue;

            System.out.println(numero);
        }
    }
}
