public class Funcionario {
    String nome;
    String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void setSalario(double valor) {
        if (valor >= 0) {
            this.salario = valor;
        }
    }

    public double getSalario(){
        if(this.salario >= 0){
            return this.salario;
        }else{
            System.out.println("Salario negativo!");
            return 0;
        }

    }
}
