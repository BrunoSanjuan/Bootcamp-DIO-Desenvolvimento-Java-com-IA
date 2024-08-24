package teste;

// Enum: Tipo especial que define um conjunto fixo de constantes, como estados brasileiros.


public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo", 1),
    RIO_JANEIRO ("RJ","Rio de Janeiro", 2),
    PIAUI ("PI", "Piauí", 3),
    MARANHAO ("MA", "Maranhão", 4);

    private String nome;
    private String sigla;
    private int iDibge;

    private EstadoBrasileiro(String sigla, String nome, int iDibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.iDibge = iDibge;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo () {
        return nome.toUpperCase();
    }

    public int getiDibge() {
        return iDibge;
    }
}
