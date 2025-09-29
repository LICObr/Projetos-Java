public class Main {
    public static void main(String[] args) {

        // Exercício 1
        Turma turma = new Turma();
        turma.matricularAluno(new Aluno(1, "Danilo"));
        turma.matricularAluno(new Aluno(2, "Fabio"));
        turma.matricularAluno(new Aluno(3, "Angela"));
        System.out.println("=== Exercício 1: Lista de alunos ===");
        turma.listarAlunos();

        // Exercício 2
        System.out.println("\n=== Exercício 2: Buscar aluno por RA ===");
        Aluno a = turma.buscarAlunoPorRa(2);
        if (a != null) {
            System.out.println("Encontrado: " + a.getNome());
        } else {
            System.out.println("Aluno n encontrado.");
        }

        // Exercício 3
        System.out.println("\n=== Exercício 3: Remover aluno ===");
        turma.removerAluno(1);
        turma.listarAlunos();

        // Exercício 4
        Playlist playlist = new Playlist();
        playlist.adicionarMusica(new Musica("Shape of You", "Ed Sheeran"));
        playlist.adicionarMusica(new Musica("Imagine", "John Lennon"));
        System.out.println("\n=== Exercício 4: Playlist ===");
        playlist.listarMusicas();
        playlist.removerMusica("Imagine");
        System.out.println("\nApós remover 'Imagine':");
        playlist.listarMusicas();

        // Exercício 5
        System.out.println("\n=== Exercício 5: Erro oculto ===");
        System.out.println("Com ArrayList não existe esse erro, mas com array fixo daria NullPointerException.");
    }
}
