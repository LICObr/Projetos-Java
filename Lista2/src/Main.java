public class Main {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Nome",10,5);

        aluno.setNome("Caio");
        aluno.setNota1(10);
        aluno.setNota2(10);

        System.out.println("Nome: " +aluno.getNome() + " nota1: " + aluno.getNota1() +
                " nota2: " + aluno.getNota2() );
    }
}
