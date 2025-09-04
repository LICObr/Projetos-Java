class Autor {
    String nome;
    String nacionalidade;
    Livro[] livros = new Livro[10]; // máximo 10 livros por autor
    int contador = 0;

    Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    // Associa um livro ao autor
    void adicionarLivro(Livro l) {
        if (contador < livros.length) {
            livros[contador] = l;
            contador++;
        } else {
            System.out.println("Limite de livros atingido!");
        }
    }

    void listarLivros() {
        System.out.println("Autor: " + nome + " | Nacionalidade: " + nacionalidade);
        System.out.println("Livros escritos:");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + livros[i].titulo);
        }
    }
}
