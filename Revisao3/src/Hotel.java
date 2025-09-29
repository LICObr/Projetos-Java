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

    public void adicionarQuarto(Quarto quarto) {
        this.quartos.add(quarto);
    }

    public void hospedar(Hospede hospede, int numeroQuarto) {
        boolean encontrado = false;

        for (int i = 0; i < this.quartos.size(); i++) {
            if (Quarto q.getNumero() == numeroQuarto){
                    q = this.quartos.get(i);
                if (q.getNumero() == numeroQuarto && !q.isOcupado()) {
                    q.ocupar(hospede);
                    System.out.println("Hospedado" + hospede.getNome() + " no quarto " + numeroQuarto);
                } else {
                System.out.printf("ja esta ocupado");
                }
            }
        }
    }

    public void realizarCheckout(int numeroQuarto){
        for(Quarto q : this.quartos){
            if(q.getNumero() == numeroQuarto && q.isOcupado() == true){
                q.liberar();
                System.out.println("Checkout do quarto " + numeroQuarto + " realizado");
            }else{
                System.out.println("Quarto " + numeroQuarto + " nao esta ocupado");
            }
        }
    }

    public void exibirRelatorioOcupacao() {
        System.out.println("Hotel" + nome + "Opcao" + endereco);
        for (Quarto q : this.quartos) {
            String status;
            String hosp;
            if (q.isOcupado()) {
                status = "Ocupado";

                Hospede h = q.getHospedeAtual();
                hosp = " | Hóspede: " + h.getNome() + " - CPF: " + h.getCpf();
            } else {
                status = "Livre";
                hosp = "";
            }
            System.out.println("Quarto " + q.getNumero() + " | " + q.getTipo() + " | " + status + hosp);
        }
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }
}


