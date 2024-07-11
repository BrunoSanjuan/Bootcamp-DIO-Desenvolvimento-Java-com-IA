public class TiposDeOperadores {
    public static void main(String[] args) throws Exception {
        System.out.println("Tipos de operadores para Java: ");

        // operadores Java
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // modulo é o resto do número que for dividido, sendo impar ou par, 18/3 = 0;
        double resultado = (10 * 7) + (20 / 4);

        System.out.println("Soma: 10.5 + 15.7 = " + soma);
        System.out.println("Subtracao: 113 - 25 = " + subtracao);
        System.out.println("Multiplicacao: 20 x 7 = " + multiplicacao);
        System.out.println("Divisao: 15 / 3 = " + divisao);
        System.out.println("Modulo: 18 % 3 = " + modulo);
        System.out.println("Resultado da soma entres parenteses: (10 * 7) + (20 / 4) = " + resultado);
    }
}
