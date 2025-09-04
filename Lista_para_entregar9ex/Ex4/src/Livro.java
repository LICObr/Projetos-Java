class Livro {
    String titulo;
    Autor autor;

    Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        autor.adicionarLivro(this); // associa automaticamente o livro ao autor
    }
}