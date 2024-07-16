public class AboutMe {
    public static void main(String[] args) {

        /* Execute em seu CMD indo para este diretório dos arquivo ---> Argumentos(diretório deste script)\bin> 
        Estando no cd Argumentos\bin> podemos utilizar os comandos a seguir: ---> java AboutMe BRUNO SANJUAN 27 1.71
        Teremos a seguinte saída abaixo: 
        Olá, me chamo BRUNO SANJUAN
        Tenho 27 anos
        Minha altura é 1.71 cm */

        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " cm");
    }
}
