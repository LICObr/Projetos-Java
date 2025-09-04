class Motor {
    public int potencia;
    public String tipoCombustivel;

    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibirDetalhe() {
        System.out.printf("\nPotencia: %d", potencia);
        System.out.printf("\nTipo de Combustivel: %s", tipoCombustivel);
    }
}
