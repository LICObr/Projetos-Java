public class Main {
    public static void main(String[] args){

        Artista art1 = new Artista("Coldplay","Pop");
        Artista art2 = new Artista("Sun","Pop");

        Musica m1 = new Musica("Fix you",123, art1);
        Musica m2 = new Musica("How about",134, art2);
        Musica m3 = new Musica("Find yourself",133, art1);

        Playlist minhaPlaylist = new Playlist("Danilo");

        minhaPlaylist.adicionarMusica(m1);
        minhaPlaylist.adicionarMusica(m2);
        minhaPlaylist.adicionarMusica(m3);

        minhaPlaylist.exibirPlaylist();

        int tempoTot = minhaPlaylist.calcularDuracaoTotal();

        System.out.println("\nTempo total da playlist: " + tempoTot);
    }
}
