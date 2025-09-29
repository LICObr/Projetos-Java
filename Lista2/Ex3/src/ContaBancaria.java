public class ContaBancaria {
    private String titular;
    private Double saldo;
    private int numeroConta;

    ContaBancaria(String titular, Double saldo, int numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    //metodo para depositar

    public void Depositar(Double valor) {
        if(valor > 0) {
            this.saldo += valor;
            System.out.println("Valor de $ " + valor + "depositado com sucesso!");
        }else{
            System.out.printf("Valor invalido");
        }
    }

    public void Sacar(Double valor) {
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de $ " + valor + " realizado com sucesso!");
        }else{
            System.out.println("Nao ha saldo suficiente!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

}

