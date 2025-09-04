public class Carro {
    private String marca;
    private String modelo;
    private int velocidadeAtual;

    Carro(String marca, String modelo, int velocidadeAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }
    public void incremento(){
        if(velocidadeAtual < 180){
            this.velocidadeAtual +=velocidadeAtual;
        }
    }

    public void decremento(){
        if(velocidadeAtual > 0){
            this.velocidadeAtual -=velocidadeAtual;
        }
    }

    public int  getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

}
