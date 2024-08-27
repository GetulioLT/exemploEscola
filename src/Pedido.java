import java.util.*;

public class Pedido {
	// Atributo que armazena o nome do cliente
	private String nomeCliente;

	// Lista de produtos que compõem o pedido
	private List<Produto> itens = new ArrayList<>();

	// Valor total do pedido
	private Double valorTotal = 0.0;

	// Construtor da classe Pedido que inicializa o nome do cliente
	public Pedido(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	// Método getter para obter a lista de itens do pedido
	public List<Produto> getItens() {
		return itens;
	}

	// Método setter para definir a lista de itens do pedido
	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}

	// Método getter para obter o nome do cliente
	public String getNomeCliente() {
		return nomeCliente;
	}

	// Método setter para definir o nome do cliente
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	// Método getter para obter o valor total do pedido
	public Double getValorTotal() {
		return valorTotal;
	}

	// Método setter para definir o valor total do pedido
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	// Método para adicionar um item ao pedido e atualizar o valor total
	public void adicionarItem(Produto produto) {
		itens.add(produto); // Adiciona o produto à lista de itens
		valorTotal += produto.getPreco(); // Atualiza o valor total do pedido
	}

	// Método para exibir os detalhes do pedido
	public void exibirPedido() {
		System.out.println("Cliente: " + nomeCliente); // Exibe o nome do cliente

		System.out.println("Pedidos: ");
		for (Produto produto : itens) {
			System.out.println("    °" + produto.getNome()); // Exibe o nome de cada produto no pedido
		}

		System.out.println("Preço total: " + valorTotal); // Exibe o valor total do pedido
	}
}