public class Main {
    public static void main(String[] args) {
    Termostato term = new Termostato(21,32);

        System.out.println("Setar temperatura!");

        term.setTemperaturaDesejada(0.5);

        System.out.println(term.getTemperaturaDesejada());;
    }
}
