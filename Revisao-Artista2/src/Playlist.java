import java.util.ArrayList;

public class Playlist {
    private String nomeDoDono;
    private ArrayList<Musica> musicas;

    public Playlist(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
        this.musicas = new ArrayList<>();
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void adicionarMusica(Musica novaMusica) {
        this.musicas.add(novaMusica);
    }

    public void exibirPlaylist(){
        System.out.printf("Exibindo playlist de: " + this.nomeDoDono + "\n");
        for(Musica m : musicas){
            System.out.println(m.getTitulo() + " | " + m.getArtista().getNome() + " | " + m.getDuracaoEmSegundos());
        }
    }

    public int calcularDuracaoTotal() {
        int total = 0;
        for (Musica m : musicas) {
            total += m.getDuracaoEmSegundos();
        }
        return total;
    }
}
