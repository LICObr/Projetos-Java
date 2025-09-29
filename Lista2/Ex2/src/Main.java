public class Main {
    public static void main(String[] args){
        Pessoa p = new Pessoa();

        p.setIdade(21);
        p.setNome("Danilo");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    }
}
