public class Quarto {
    private int numero;
    private String tipo;
    private double precoPorNoite;
    private boolean ocupado;
    private Hospede hospedeAtual;

    public Quarto(int numero, String tipo, double precoPorNoite) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoPorNoite = precoPorNoite;
        this.ocupado = false;
        this.hospedeAtual = null;
    }

    public void ocupar(Hospede hospede) {
        if (ocupado == false) {
            this.hospedeAtual = hospede;
            this.ocupado = true;
        } else {
            System.out.printf("Ja esta ocupado!");
        }
    }

    public void liberar(){
            if(ocupado == false){
                System.out.println("Ja esta desocupado");
            }else{
                this.ocupado = false;
                this.hospedeAtual = null;
            }
    }

    public int getNumero() {
        return this.numero;
    }

    public Hospede getHospedeAtual() {
        return this.hospedeAtual;
    }

    public String getTipo() {
        return this.tipo;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }
}