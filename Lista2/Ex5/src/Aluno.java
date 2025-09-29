public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome) {
        this.nome = nome;
    }

    // Getter e Setter da nota1
    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota1 = nota;
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        }
    }

    // Getter e Setter da nota2
    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota2 = nota;
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        }
    }

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Método opcional para calcular média
    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
}
