class Carro {
    public String marca;
    public String modelo;
    public Motor motor;

    public Carro(String marca, String modelo, int potencia, String tipoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(potencia, tipoCombustivel);
    }

    public void exibirDetalhes() {
        System.out.println("Carro");
        System.out.printf("\nMarca: %s", marca);
        System.out.printf("\nModelo: %s", modelo);
        motor.exibirDetalhe();
    }
}