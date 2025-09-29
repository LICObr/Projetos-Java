public class Main {
    public static void main(String[] args) {
        // a) Crie um objeto Hotel.
        Hotel hotel = new Hotel("Grand Hotel Maringá", "R. das Flores, 123");

        // b) Crie e adicione vários objetos Quarto a este hotel.
        hotel.adicionarQuarto(new Quarto(101, "Standard", 150.0));
        hotel.adicionarQuarto(new Quarto(102, "Standard", 150.0));
        hotel.adicionarQuarto(new Quarto(201, "Deluxe", 300.0));
        hotel.adicionarQuarto(new Quarto(301, "Suíte", 600.0));

        // c) Crie dois objetos Hospede diferentes.
        Hospede h1 = new Hospede("João Silva", "111.222.333-44");
        Hospede h2 = new Hospede("Maria Souza", "555.666.777-88");

        // d) Exiba o status inicial de todos os quartos do hotel (todos devem estar livres).
        System.out.println("\n--- Status inicial ---");
        hotel.exibirRelatorioOcupacao();

        // e) Realize a hospedagem do primeiro hóspede em um dos quartos.
        System.out.println("\n--- Hospedando h1 no quarto 201 ---");
        hotel.hospedar(h1, 201);

        // f) Tente hospedar o segundo hóspede no mesmo quarto (o sistema deve impedir).
        System.out.println("\n--- Tentando hospedar h2 no mesmo quarto 201 ---");
        hotel.hospedar(h2, 201);

        // g) Hospede o segundo hóspede em outro quarto vago.
        System.out.println("\n--- Hospedando h2 no quarto 301 ---");
        hotel.hospedar(h2, 301);

        // h) Exiba novamente o status de todos os quartos (agora dois devem estar ocupados).
        System.out.println("\n--- Status após duas hospedagens ---");
        hotel.exibirRelatorioOcupacao();

        // i) Realize o check-out do primeiro hóspede.
        System.out.println("\n--- Checkout do quarto 201 ---");
        hotel.realizarCheckout(201);

        // j) Exiba o status final de todos os quartos.
        System.out.println("\n--- Status final ---");
        hotel.exibirRelatorioOcupacao();
    }
}
