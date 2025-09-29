public class Main {
    public static void main(String[] args) {

        Professor prof1 = new Professor("Hugo Fumero");
        Professor prof2 = new Professor("Joao Ferlini");

        Disciplina d1 = new Disciplina("Banco de Dados", 80, prof1);
        Disciplina d2 = new Disciplina("Redes de Computadores", 60, prof2);
        Disciplina d3 = new Disciplina("Algoritmos e Logica de Programacao", 40, prof2);

        Disciplina[] disciplinasCurso = { d1, d2, d3 };
        Curso curso = new Curso("Engenhaeiua de Software", prof1, disciplinasCurso);

        curso.exibirCurso();
    }
}