public class Main {
    public static void main(String[] args) {
        Time t1 = new Time("Flamengo", "Rio de Janeiro");

        Jogador j1 = new Jogador("Gabriel", "Atacante");
        Jogador j2 = new Jogador("Pedro", "Goleiro");
        Jogador j3 = new Jogador("Lucas", "Meio-campo");

        t1.adicionarJogador(j1);
        t1.adicionarJogador(j2);
        t1.adicionarJogador(j3);

        t1.listarJogadores();
    }
}