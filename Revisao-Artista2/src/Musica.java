public class Musica {
    private String titulo;
    private int duracaoEmSegundos;
    private Artista artista;

    public Musica(String titulo, int duracaoEmSegundos, Artista artista) {
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public Artista getArtista() {
        return artista;
    }
}
