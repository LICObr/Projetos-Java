import java.util.ArrayList;

public class Playlist {
    private ArrayList<Musica> musicas;

    public Playlist() {
        musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public void listarMusicas() {
        for (Musica m : musicas) {
            System.out.println(m.getTitulo() + " - " + m.getArtista());
        }
    }

    public void removerMusica(String titulo) {
        musicas.removeIf(m -> m.getTitulo().equalsIgnoreCase(titulo));
    }
}
