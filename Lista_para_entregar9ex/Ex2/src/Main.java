public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo(5); // cria um círculo com raio 5

        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}