class Pedido {
    Cliente cliente;
    Produto[] produtos = new Produto[10]; // máximo 10 produtos para simplificar
    int contador = 0;

    Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    void adicionarProduto(Produto p) {
        if (contador < produtos.length) {
            produtos[contador] = p;
            contador++;
        } else {
            System.out.println("Limite de produtos atingido!");
        }
    }

    void mostrarDetalhes() {
        System.out.println("Cliente: " + cliente.nome + " | CPF: " + cliente.cpf);
        System.out.println("Produtos comprados:");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + produtos[i].nome + " | R$ " + produtos[i].preco);
        }
    }
}