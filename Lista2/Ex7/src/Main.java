public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("1984", "George Orwell");

        System.out.println("Disponível? " + l1.getDisponivel()); // true

        l1.emprestar();
        System.out.println("Disponível? " + l1.getDisponivel()); // false

        l1.devolver();
        System.out.println("Disponível? " + l1.getDisponivel()); // true
    }
}