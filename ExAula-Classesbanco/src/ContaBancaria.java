public class ContaBancaria {
    String numeroConta;
    String agencia;
    double saldo;

    Pessoa[] dependentes;
    Pessoa titular;
    Cartao[] cartoes;

    ContaBancaria(String numeroConta, String agencia, double saldo,
                  String nometitular, String cpfTitular,
                  String dataNascimentoTitular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = new Pessoa(nometitular, cpfTitular, dataNascimentoTitular);
        this.dependentes = new Pessoa[0]; // Inicializa como vazio
        this.cartoes = new Cartao[0];     // Inicializa como vazio
    }

    // Método para adicionar cartão
    public void adicionarCartao(Cartao cartao) {
        Cartao[] novoArray = new Cartao[this.cartoes.length + 1];
        for (int i = 0; i < this.cartoes.length; i++) {
            novoArray[i] = this.cartoes[i];
        }
        novoArray[this.cartoes.length] = cartao;
        this.cartoes = novoArray;
    }
}