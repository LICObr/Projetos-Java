public class Main{
    public static void main(String[] args){

        //a criar um objeto hotel
    Hotel hotel = new Hotel("Grand Hotel Maringa","Rua das Flores, 123");

        //b criar e adicionar varios objetos quarto ao hotel
        hotel.adicionarQuarto(new Quarto(123,"Deluxe",1234.43));
        hotel.adicionarQuarto(new Quarto(124,"Deluxe",1234.43));
        hotel.adicionarQuarto(new Quarto(125,"Deluxe",1234.43));
        hotel.adicionarQuarto(new Quarto(126,"Deluxe",1234.43));

        //c criar dois hospedes diferentes

        Hospede h1 = new Hospede("Danilo Mori Schuler", "21312321312");
        Hospede h2 = new Hospede("Fabio Mori Schuler", "11212321312");

        //d Exibir status do hotel

        System.out.println("\n--- Status inicial ---");
        hotel.exibirRelatorioOcupacao();

        //Realize a hospedagem do primeiro hóspede em um dos quartos.
        System.out.println("\n Hospedando h1 no quarto 123");
        hotel.hospedar(h1, 123);

        // f) Tente hospedar o segundo hóspede no mesmo quarto (o sistema deve impedir).

        System.out.println("\n Hospedando h2 no quarto 123");
        hotel.hospedar(h2, 123);

        // g) Hospede o segundo hóspede em outro quarto vago.

        System.out.println("\n Hospedando h2 no quarto 124");
        hotel.hospedar(h2, 124);

        // h) Exiba novamente o status de todos os quartos (agora dois devem estar ocupados).

        System.out.println("\n--- Status ---");
        hotel.exibirRelatorioOcupacao();

        // i) Realize o check-out do primeiro hóspede.

        System.out.println("\n Checkout de h1 no quarto 123");
        hotel.realizarCheckout(123);

        // j) Exiba o status final de todos os quartos.

        System.out.println("\n--- Status final ---");
        hotel.exibirRelatorioOcupacao();
    }
}