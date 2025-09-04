public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");

        Livro livro1 = new Livro("Dom Casmurro", autor1);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", autor1);

        autor1.listarLivros();
    }
}