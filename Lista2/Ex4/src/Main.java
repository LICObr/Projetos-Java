public class Main {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Nome","Cargo",1000);

        func.setSalario(2000000);
        System.out.println(func.getSalario());
    }
}
