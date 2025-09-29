public class Main {
    public static void main(String[] args){
        Playlist minhaPlaylist = new Playlist("Danilo");

        Artista artista1 = new Artista("Ed Sheeran", "eletronica");
        Artista artista2 = new Artista("The weeknd", "eletronica");


        Musica m1 = new Musica("Shape of you", 240, artista1);
        Musica m2 = new Musica("Blinding Lights", 200, artista2);
        Musica m3 = new Musica("Perfect", 263, artista1);


        minhaPlaylist.adicionarMusica(m1);
        minhaPlaylist.adicionarMusica(m2);
        minhaPlaylist.adicionarMusica(m3);

        minhaPlaylist.exibirPlaylist();

        minhaPlaylist.calcularDuracaoTotal();

    }
}
