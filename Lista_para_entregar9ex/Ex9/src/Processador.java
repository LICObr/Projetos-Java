class Processador {
    private String modelo;
    private double velocidadeGHz;

    public Processador(String modelo, double velocidadeGHz) {
        this.modelo = modelo;
        this.velocidadeGHz = velocidadeGHz;
    }

    @Override
    public String toString() {
        return modelo + " (" + velocidadeGHz + " GHz)";
    }
}
