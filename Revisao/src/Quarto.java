public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite){
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.hospedeAtual = null;
        this.ocupado = false;
    }

    public void ocupar(Hospede hospede){
        if (!this.ocupado) {
            this.hospedeAtual = hospede;
            this.ocupado = true;
        } else {
        }
    }

    public void liberar(){
        this.hospedeAtual = null;
        this.ocupado = false;
    }

    public int getNumero(){
        return this.numero;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

    public Hospede getHospedeAtual(){
        return this.hospedeAtual;
    }

    public String getTipo(){
        return this.tipo;
    }

}
