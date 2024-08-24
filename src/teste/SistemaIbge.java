package teste;

public class SistemaIbge {
    public static void main(String[] args) {
        /*
        *Método values(): EstadoBrasileiro.values() é um método gerado automaticamente para qualquer enumeração em Java.
        *Ele retorna um array contendo todas as constantes da enumeração EstadoBrasileiro, ou seja, todos os estados definidos nela.
        * */
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome() + " - IBGE ID: " + e.getiDibge());
        }

        //Selecionando o Estado e opções específicas para imprimir
        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
        System.out.println("\n" + eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println("IBGE ID: " + eb.getiDibge());

    }
}
