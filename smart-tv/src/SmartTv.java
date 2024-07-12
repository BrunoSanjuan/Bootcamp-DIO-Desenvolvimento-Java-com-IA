public class SmartTv {
    //Aqui entra as funções.
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        System.out.println("Ligando Smart Tv...");
        ligada = true;
    }

    public void desligar() {
        System.out.println("Desligando Smart Tv...");
        ligada = false;
    }

    public void trocarCanalFrente() {
        System.out.println("Trocando de canal...+1");
        canal++;
    }

    public void trocarCanalTras() {
        System.out.println("Trocando de canal...-1");
        canal--;
    }

    public void escolherCanal(int novoCanal) {
        System.out.println("Trocando para canal selecionado...");
        canal = novoCanal;
    }

    public void diminuirVolume() {
        System.out.println("Diminuindo volume...-1");
        volume--;
    }

    public void aumentarVolume() {
        System.out.println("Aumentando volume...+1");
        volume++;
    }
}
