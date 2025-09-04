public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Ana", 25);

        // Exibe idade antes do aniversário
        p.exibirIdade();

        // Faz aniversário
        p.fazerAniversario();

        // Exibe idade depois do aniversário
        p.exibirIdade();
    }
}
