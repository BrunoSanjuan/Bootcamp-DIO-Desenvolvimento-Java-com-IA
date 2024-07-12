public class UsandoMetodos {
    public static void main(String[] args) {

        /* Critérios para uso de metodos(funções):
         * - Usar verbos para nomear o metodo. Ex: acelerar, frear, processar, concluir etc..;
         * - Seguir o padrão camelCase. Ex: acelerarCarro, processarPedido...(segunda palavra começa MAIÚSCULO);
         * - Caso o metodo não retorne nenhum valor, ele será representado pela palavra-chave void;
         * - Veja abaixo um metodo, como exemplo desenvolvi o metodo "validar";
         */
        System.out.println("Criando um método. Esta função esta sendo executada através de um método em Java.");

        // Criar uma instância da classe UsandoMetodos, para conseguir chamar um metodo(função) que esteja fora do metodo main;
        UsandoMetodos um = new UsandoMetodos();
        
        // Chamar o método validar usando a instância criada;
        um.validar();
    }

        public void validar() {
            int idade = 27;
            System.out.println("Você é maior de idade? ");
            System.out.println("Sua idade é: " + idade);

            if (idade < 18) {
                System.out.println("Infelizmente não podemos prosseguir, você é menor de idade!");
            }else {
                System.out.println("ótimo, você é maior de idade, aguarde o carregamento da tela... ");
            }
        }
}
