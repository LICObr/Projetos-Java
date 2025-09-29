public class    Curso {
    private String nomeCurso;
    private Professor professorResponsavel;
    private Disciplina[] disciplinas;

    public Curso(String nomeCurso, Professor professorResponsavel, Disciplina[] disciplinas) {
        this.nomeCurso = nomeCurso;
        this.professorResponsavel = professorResponsavel;
        this.disciplinas = disciplinas;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public int TotalHoras() {
        int total = 0;
        for (Disciplina disciplina : disciplinas) {
            total += disciplina.getHoras();
        }
        return total;
    }

    public void exibirCurso() {
        System.out.println("Curso:" + nomeCurso);
        System.out.println("Professor " + professorResponsavel);
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println(" - " + disciplina);
        }
        System.out.println("Carga horaria total: " + TotalHoras() + " horas");
    }
}
