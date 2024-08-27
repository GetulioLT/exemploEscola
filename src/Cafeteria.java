import java.util.*;

public class Cafeteria {
	public static void main(String[] args) {
		// Scanner para leitura de dados do usuário
		Scanner scanner = new Scanner(System.in);

		// Inicializa um pedido vazio
		Pedido pedido = new Pedido("");

		int controle; // Variável de controle para os menus
		String cont, nomeCliente; // Variáveis para controle de fluxo e nome do cliente

		// Lista de produtos disponíveis
		ArrayList<Produto> produtos = new ArrayList<>();

		// Mapa para armazenar os produtos escolhidos pelo cliente
		HashMap<String, Integer> produtosCliente = new HashMap<>();

		do { // Laço principal
			System.out.println("Escolha uma das opções: ");
			System.out.println("1 - Cliente");
			System.out.println("2 - Funcionário");
			System.out.println("0 - Finalizar Sistema");

			controle = scanner.nextInt(); // Lê a opção escolhida pelo usuário

			switch (controle) {
				case 1:
					do { // Laço cliente
						System.out.println("Escolha uma das opções: ");
						System.out.println("1 - Iniciar Pedido");
						System.out.println("0 - Finalizar Pedido");

						controle = scanner.nextInt(); // Lê a opção escolhida pelo cliente

						switch (controle) {
							case 1: // Iniciar pedido
								if (!produtos.isEmpty()) { // Verifica se há produtos cadastrados
									System.out.println("Digite o seu nome: ");
									nomeCliente = scanner.next(); // Lê o nome do cliente
									do {
										for (int i = 0; i < produtos.size(); i++) {
											System.out.println(i + ": " + produtos.get(i).getNome()); // Exibe os produtos disponíveis
										}
										// Lê a escolha do cliente
										int escolha = scanner.nextInt();

										// Adiciona o produto escolhido ao mapa de produtos do cliente
										produtosCliente.put(produtos.get(escolha).getNome(), escolha);

										// Pergunta se o cliente quer adicionar mais itens
										System.out.println("Quer adicionar um novo item(s/n)");
										cont = scanner.next();
									} while (cont.equals("s")); // Continua adicionando itens enquanto o cliente desejar

									// Cria um novo pedido com o nome do cliente
									pedido = new Pedido(nomeCliente);
									for (String nome : produtosCliente.keySet()) {
										// Adiciona os produtos escolhidos ao pedido
										pedido.adicionarItem(produtos.get(produtosCliente.get(nome)));
									}

								} else {
									System.out.println("Não há itens cadastrados"); // Mensagem caso não haja produtos cadastrados
								}
								break;

							case 0:
								if (!pedido.getItens().isEmpty()) { // Verifica se há itens no pedido
									pedido.exibirPedido(); // Exibe os detalhes do pedido
								} else {
									System.out.println("Pedido não realizado"); // Mensagem caso não haja itens no pedido
								}
								break;

							default:
								System.out.println("Opção inexistente"); // Mensagem para opção inválida
								break;
						}
					} while (controle != 0); // Continua no laço cliente enquanto a opção não for finalizar

					controle = 1; // Reseta a variável de controle para o laço principal
					break;

				case 2:
					do { // Laço funcionário
						System.out.println("Digite uma das opções:");
						System.out.println("1 - Cadastrar item");
						System.out.println("0 - Finalizar");

						controle = scanner.nextInt(); // Lê a opção escolhida pelo funcionário

						switch (controle) {
							case 1:
								do {
									String nome; // Variável para o nome do produto
									double preco; // Variável para o preço do produto

									System.out.println("Digite o nome do item: ");
									nome = scanner.next(); // Lê o nome do produto
									System.out.println("Digite o valor do item: ");
									preco = scanner.nextDouble(); // Lê o preço do produto

									// Adiciona o novo produto à lista de produtos
									produtos.add(new Produto(nome, preco));

									// Pergunta se o funcionário quer adicionar mais itens
									System.out.println("Quer adicionar um novo item(s/n)");
									cont = scanner.next();
								} while (cont.equals("s")); // Continua adicionando itens enquanto o funcionário desejar
								break;
							case 0:
								break;
							default:
								System.out.println("Opção inexistente"); // Mensagem para opção inválida
								break;
						}
					} while (controle != 0); // Continua no laço funcionário enquanto a opção não for finalizar
					controle = 1; // Reseta a variável de controle para o laço principal
					break;
			}

		} while (controle != 0); // Continua no laço principal enquanto a opção não for finalizar o sistema
	}
}