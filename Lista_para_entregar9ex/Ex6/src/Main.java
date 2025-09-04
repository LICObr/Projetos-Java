public class Main {
    public static void main(String[] args) {
        // Criando os cômodos
        Comodo[] listaComodos = {
                new Comodo("Sala"),
                new Comodo("Cozinha"),
                new Comodo("Quarto 1"),
                new Comodo("Quarto 2"),
                new Comodo("Banheiro")
        };

        // Criando a casa com os cômodos
        Casa casa = new Casa("Avenida Brasil, 123", listaComodos);

        // Mostrando os cômodos da casa
        casa.mostrarComodos();
    }
}