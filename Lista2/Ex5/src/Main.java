public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Nome");

        aluno1.setNota1(8.5);
        aluno1.setNota2(11.0); // inválida, não será atribuída

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Média: " + aluno1.calcularMedia());
    }
}
