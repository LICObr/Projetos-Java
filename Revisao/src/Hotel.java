import java.util.ArrayList;

public class Hotel {
    private String nome;
    private String endereco;
    private ArrayList<Quarto> quartos;

    // Construtor simples: apenas nome e endereco (como no UML)
    public Hotel(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.quartos = new ArrayList<Quarto>();
    }

    // conforme UML: adicionarQuarto(quarto : Quarto) : void
    public void adicionarQuarto(Quarto quarto){
        this.quartos.add(quarto);
    }

    // conforme UML: hospedar(hospede : Hospede, numeroQuarto : int) : void
    public void hospedar(Hospede hospede, int numeroQuarto){
        for (Quarto q : this.quartos){
            if (q.getNumero() == numeroQuarto){
                if (!q.isOcupado()){
                    q.ocupar(hospede);
                    System.out.println("Hospedado: " + hospede.getNome() + " no quarto " + numeroQuarto);
                } else {
                    System.out.println("Impossível hospedar: quarto " + numeroQuarto + " já está ocupado.");
                }
                return;
            }
        }
        System.out.println("Quarto " + numeroQuarto + " não encontrado.");
    }

    // conforme UML: realizarCheckout(numeroQuarto : int) : void
    public void realizarCheckout(int numeroQuarto){
        for (Quarto q : this.quartos){
            if (q.getNumero() == numeroQuarto){
                if (q.isOcupado()){
                    q.liberar();
                    System.out.println("Checkout realizado no quarto " + numeroQuarto);
                } else {
                    System.out.println("Quarto " + numeroQuarto + " já está livre.");
                }
                return;
            }
        }
        System.out.println("Quarto " + numeroQuarto + " não encontrado.");
    }

    // conforme UML: exibirRelatorioOcupacao() : void
    public void exibirRelatorioOcupacao(){
        System.out.println("Relatório do hotel: " + nome + " - " + endereco);
        for (Quarto q : this.quartos){
            String status = q.isOcupado() ? "Ocupado" : "Livre";
            String hosp = "";
            if (q.isOcupado()){
                Hospede h = q.getHospedeAtual();
                hosp = " | Hóspede: " + h.getNome() + " - CPF: " + h.getCpf();
            }
            System.out.println("Quarto " + q.getNumero() + " | " + q.getTipo() + " | " + status + hosp);
        }
    }

    // getters mínimos (mantidos simples)
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }
}
