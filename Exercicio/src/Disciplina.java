public class Disciplina {
    private String nome;
    private int horas;
    private Professor professor;

    public Disciplina(String nome, int horas, Professor professor) {
        this.nome = nome;
        this.horas = horas;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public int getHoras() {
        return horas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String toString() {
        return nome + " - " + horas + " horas Prof " + professor.getNome();
    }
}