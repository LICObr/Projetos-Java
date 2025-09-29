public class Main {
    public static void main(String[] args){

        Hotel hotel1 = new Hotel("The grand hotel","Maringa");

        Quarto q1 = new Quarto(110,"Deluxe",57.500);
        Quarto q2 = new Quarto(111,"Deluxe",57.500);
        Quarto q3 = new Quarto(112,"Deluxe",57.500);

        hotel1.adicionarQuarto(q1);
        hotel1.adicionarQuarto(q2);
        hotel1.adicionarQuarto(q3);

        Hospede h1 = new Hospede("08321312","Danilo Mori Schuler");
        Hospede h2 = new Hospede("03321312","Fabio Mori Schuler");

        hotel1.exibirRelatorioOcupacao();

        hotel1.hospedar(h1,110);
        hotel1.hospedar(h2,110);

        hotel1.exibirRelatorioOcupacao();

        hotel1.realizarCheckout(110);

        hotel1.exibirRelatorioOcupacao();


    }
}
