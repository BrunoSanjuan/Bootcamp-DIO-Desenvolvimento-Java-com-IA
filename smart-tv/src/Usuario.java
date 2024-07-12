public class Usuario {
    public static void main(String[] args) throws Exception {
        /*Este script tem como objetivo colocar em prática o uso de métodos. Suas funções tem as opções de:
         - Ligar e desligar a Tv;
         - Aumentar e diminuir o volume de -1 e +1;
         - mudar de canal de 1 em 1 ou escolher o número direto do canal;
         */

        SmartTv smartTv = new SmartTv(); // Instância de uma classe que esta fora do main
        System.out.println("A Smart Tv está ligada: " + smartTv.ligada);

        // Ligou a Smart Tv
        smartTv.ligar();
        System.out.println("A Smart Tv está ligada: " + smartTv.ligada);
        System.out.println("Em qual canal está: " + smartTv.canal);
        System.out.println("Em qual volume está: " + smartTv.volume);

        // Trocar de canal para frente
        smartTv.trocarCanalFrente();
        smartTv.trocarCanalFrente();
        smartTv.trocarCanalFrente();
        System.out.println("Em qual canal está: " + smartTv.canal);

        // Diminuir o volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Em qual volume está: " + smartTv.volume);
    }
}
