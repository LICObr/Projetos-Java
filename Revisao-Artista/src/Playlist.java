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

    public void adicionarMusica(Musica novaMusica){
        this.musicas.add(novaMusica);
    }

    public void exibirPlaylist(){
        System.out.println("Playlist de " + nomeDoDono + ": ");
        for(Musica m:musicas){
            System.out.println("|" + m.getTitulo() + "|" +  m.getArtista().getNome() + "|" + m.getDuracaoEmSegundos());
        }
    }

    public void calcularDuracaoTotal(){
        int tempoTotal = 0;
        for(Musica m:musicas){
            tempoTotal += m.getDuracaoEmSegundos();
        }
        System.out.println("Total de segundos: " + tempoTotal);
    }
}

