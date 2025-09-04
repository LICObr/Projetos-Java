class Pessoa {
    String nome;
    int idade;

    // Construtor
    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para fazer aniversário (aumenta 1 ano)
    void fazerAniversario() {
        idade++;
    }

    // Método para exibir a idade
    void exibirIdade() {
        System.out.println(nome + " tem " + idade + " anos.");
    }
}