public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Danilo", "1a2345678");

        usuario.setSenha("123456");
        usuario.setSenha("12345678");

        System.out.println(usuario.getSenha());
    }
}
