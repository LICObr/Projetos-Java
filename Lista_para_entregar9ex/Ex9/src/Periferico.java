class Periferico {
    private String tipo;
    private String marca;

    public Periferico(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return tipo + " - " + marca;
    }
}