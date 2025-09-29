import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno a : alunos) {
            System.out.println(a.getNome() + " - RA: " + a.getRa());
        }
    }

    public Aluno buscarAlunoPorRa(int ra) {
        for (Aluno a : alunos) {
            if (a.getRa() == ra) {
                return a;
            }
        }
        return null;
    }

    public void removerAluno(int ra) {
        alunos.removeIf(a -> a.getRa() == ra);
    }
}
