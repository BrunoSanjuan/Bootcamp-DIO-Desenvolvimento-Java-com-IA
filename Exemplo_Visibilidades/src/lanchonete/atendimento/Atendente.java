package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheNaCozinha();
		System.out.println("SERVINDO MESA");
	}
	private void pegarLancheNaCozinha() {
		System.out.println("PEGANDO O LANCHE NA COZINHA");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO PAGAMENTO");
	}
	void trocarGas() {
		System.out.println("ATENDENTE TROCANDO O GAS");
	}
	private void pegarPedidoBalcao() {
		System.out.println("PEGANDO O PEDIDO NO BALCAO");
	}
}
