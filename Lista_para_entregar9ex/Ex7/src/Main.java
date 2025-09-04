public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("João Silva", "123.456.789-00");

        Disciplina d1 = new Disciplina("Matemática");
        Disciplina d2 = new Disciplina("Física");

        // Associa as disciplinas ao professor
        prof1.adicionarDisciplina(d1);
        prof1.adicionarDisciplina(d2);

        // Mostra resultado
        prof1.mostrarDisciplinas();
    }
}
