public class Termostato {
    private double temperaturaAtual;
    private double temperaturaDesejada;

    Termostato(double temperaturaAtual, double temperaturaDesejada){
        this.temperaturaAtual = temperaturaAtual;
        this.temperaturaDesejada = temperaturaDesejada ;
    }
    //Criar getters e setters, garantindo que temperaturaDesejada não pode ser menor que 15°C
    //nem maior que 30°C.

    public double getTemperaturaAtual(){
        return this.temperaturaAtual;
    }
    public double getTemperaturaDesejada(){
        return this.temperaturaDesejada;
    }
    public void setTemperaturaDesejada(double temperaturadesejada){
        if(temperaturadesejada > 15 && temperaturadesejada < 30){
            this.temperaturaDesejada = temperaturadesejada;
        }else{
            System.out.println("Não pode ser menor que 15°C nem maior que 30°C.");
        }
    }
}
