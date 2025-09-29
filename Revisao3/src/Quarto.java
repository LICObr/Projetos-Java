public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospede;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
        this.hospede = null;
    }

    public void ocupar(Hospede hospede) {
        if (this.ocupado == false) {
            this.hospede = hospede;
            ocupado = true;
        }
    }

    public void liberar(){
        this.hospede = null;
        ocupado = false;
    }

    public int getNumero(){
        return this.numero;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }

    public Hospede getHospedeAtual(){
        return this.hospede;
    }

    public String getTipo(){
        return this.tipo;
    }
}

