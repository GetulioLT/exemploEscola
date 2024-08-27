public class Produto {
	// Atributo que armazena o nome do produto
	private String nome;

	// Atributo que armazena o preço do produto
	private Double preco;

	// Construtor da classe Produto que inicializa os atributos nome e preco
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Método getter para obter o nome do produto
	public String getNome() {
		return nome;
	}

	// Método setter para definir o nome do produto
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método getter para obter o preço do produto
	public Double getPreco() {
		return preco;
	}

	// Método setter para definir o preço do produto
	public void setPreco(Double preco) {
		this.preco = preco;
	}
}