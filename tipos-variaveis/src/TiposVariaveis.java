public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String meuNome = "Bruno Sanjuan";
        boolean aprovadoNoTeste = true; // verdadeiro ou falso;
        char permissaoVisto = 'S'; // usa-se uma aspa e para caráctere;
        double salarioMinimo = 1412.00; // usa-se ponto, neste caso o valor é mil quatrocentos e doze;
        byte idade = 27; // usa-se números entre -128 a 127, caso esteja fora deste range, ocorrerá erros;
        short ano = 2024; // usa-se números entre -32.768 a 32.767, caso esteja fora deste range, ocorrerá erros;
        int cep = 123456789; // usa-se números entre -2.147.483.648 a 2.147.483.647, caso esteja fora deste range, ocorrerá erros; Se começar com valor 0 talvez seja necessário usar outro tipo.
        long cpf = 19876543210L; // usa-se números entre -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807, caso esteja fora deste range, ocorrerá erros; long precisa terminar com L; Se começar com valor 0 talvez seja necessário usar outro tipo.
        float PI = 3.14F; // float precisa terminar com F; variável em MAIÚSCULO ou a palavra "final" antes de qualquer variável lhe tornará uma variável de valor constante.
    }
}
