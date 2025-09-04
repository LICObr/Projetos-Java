class Time {
    String nome;
    String cidade;
    Jogador[] jogadores = new Jogador[11]; // máximo 11 jogadores para simplificar
    int contador = 0;

    Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    // Adiciona um jogador ao time
    void adicionarJogador(Jogador j) {
        if (contador < jogadores.length) {
            jogadores[contador] = j;
            contador++;
        } else {
            System.out.println("Time cheio!");
        }
    }

    // Lista os jogadores do time
    void listarJogadores() {
        System.out.println("Time: " + nome + " | Cidade: " + cidade);
        System.out.println("Jogadores:");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + jogadores[i].nome + " | Posição: " + jogadores[i].posicao);
        }
    }
}
