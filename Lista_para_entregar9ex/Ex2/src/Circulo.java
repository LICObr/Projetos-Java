class Circulo {
    double raio;

    // Construtor
    Circulo(double raio) {
        this.raio = raio;
    }

    // Calcula a área
    double calcularArea() {
        return Math.PI * raio * raio;
    }

    // Calcula o perímetro
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}