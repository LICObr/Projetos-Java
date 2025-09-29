import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;

    public Hotel(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<Quarto>();
    }

    public void adicionarQuarto(Quarto quarto){
        this.quartos.add(quarto);
    }

    public void hospedar(Hospede hospede, int numeroQuarto){
        for(Quarto q : quartos){
            if(q.getNumero() == numeroQuarto){
                if(q.isOcupado() == false){
                    System.out.println("Hospedado: " + hospede.getNome() + " no quarto: " +  numeroQuarto);
                    q.ocupar(hospede);
                }else{
                    System.out.println("Ja esta ocupado");
                }
                return;
            }
        }
        System.out.println("Quarto " + numeroQuarto + " não encontrado.");
    }

    public void realizarCheckout(int numeroQuarto){
        for(Quarto q : quartos){
            if(q.getNumero() == numeroQuarto){
                if(q.isOcupado() == true){
                    System.out.println("Desocupando ...");
                    q.liberar();
                }else{
                    System.out.println("Nao esta ocupado");
                }
                return;
            }
        }
        System.out.println("Quarto " + numeroQuarto + " não encontrado.");
    }

    public void exibirRelatorioOcupacao(){
        System.out.println("Relatorio do hotel: " + this.nome + " endereco: " + this.endereco + "\n");
        for(Quarto q : quartos){
            if(q.isOcupado() == true){
                Hospede hosp = q.getHospedeAtual();
                System.out.println("Quarto | " + q.getNumero() + " | ocupado por | " + q.getHospedeAtual());
            }
        }
    }

}
